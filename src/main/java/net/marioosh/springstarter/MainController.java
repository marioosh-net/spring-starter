package net.marioosh.springstarter;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.marioosh.springstarter.model.dao.UserDAO;
import net.marioosh.springstarter.model.entities.User;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	private Logger log = Logger.getLogger(MainController.class);

	@Autowired
	private Validator validator;

	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private ServletContext servletContext;

	/**
	 * metoda poleci przy obsludze kazdego requesta, bo @ModelAttribute
	 * dorzucam do niej inne modelAttributy poprzed parametr model 
	 * @param model
	 * @return
	 */
	@ModelAttribute("context")
	public String context(Model model) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		model.addAttribute("servername", request.getServerName());
		return request.getContextPath();
	}

	@RequestMapping(value={"/home"})
	public String index() {
		return "index";
	}
	
	@RequestMapping(value={"/home/{msg}"})
	public String index(@PathVariable String msg, Model model) {
		model.addAttribute("msg", msg);
		return "index";
	}
	
	/**
	 * Metoda biznesowa wykona się, jeśli zalogowany będzie user
	 * @return
	 */
	@Secured("ROLE_USER")
	@RequestMapping("/secured")	
	public String secured() {
		return "secured";
	}	
	
	@RequestMapping("/exception")
	public void testException() throws Exception {
		throw new Exception("Exception !!!");
	}
	
	@RequestMapping("/exception2")
	public void testException2() throws Exception {
		throw new NullPointerException("NullPointerException !!!");
	}
	
	@RequestMapping("/json")
	public @ResponseBody User getJSON(@RequestParam Long id) {
		return userDAO.get(id);
	}
	
	@RequestMapping("/responseBody")
	@ResponseBody
	public String responseBody() {
		return "@ResponseBody example";
	}
		
	@RequestMapping("/image")
	public void getImage(HttpServletResponse response) throws IOException {
		response.setContentType("image/gif");
		IOUtils.copy(servletContext.getResourceAsStream("/images/ajax.gif"), response.getOutputStream());
	}
	
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam Long id) {
		userDAO.delete(id);
		
		/**
		 * redirect, czyli przekierowanie, w tym wypadku na strone /form"
		 */
		return "redirect:/form";
	}
	
	@RequestMapping("/users")
	public ModelAndView users() {
		return new ModelAndView("users", "users", userDAO.findAll());
	}
	
	@RequestMapping("/users/{page}")
	public ModelAndView users(@PathVariable("page") int page, Model model) {
		int p = userDAO.countPages(5);
		int[] p2 = new int[p];
		for(int i = 0; i< p; i++) {
			p2[i] = i;
		}
		model.addAttribute("pages", p2);
		return new ModelAndView("userslist", "users", userDAO.findAll(page));
	}
	
	@RequestMapping("/users2")
	@ResponseBody
	public String usersDirect() {
		StringBuilder sb = new StringBuilder();
		sb.append("<ul>");
		for(User u: userDAO.findAll()) {
			sb.append("<li>"+u.getLogin()+": "+	u.getFirstname()+": "+	u.getLastname()+": "+ u.getEmail()+"</li>");
		}
		return sb.toString();
	}
	
	/*
	 * teraz jest ogolny: SimpleMappingExceptionResolver
	 * 
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception ex) throws IOException {
		log.error(ex.getMessage(), ex);
		return new ModelAndView("error", "message", ex.getMessage());
	}	
	*/

}
