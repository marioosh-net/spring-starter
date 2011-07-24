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

	@RequestMapping(value="/data", method=RequestMethod.POST)
	public String getData(@RequestParam User data) {
		return "index";
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
	
	@Secured("ROLE_ADMIN")
	@RequestMapping("/secured")	
	public String secured() {
		return "index";
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
	public @ResponseBody User getJSON() {
		return new User();
	}
		
	@RequestMapping("/image")
	public @ResponseBody byte[] getImage(HttpServletResponse r) throws IOException {
		r.setContentType("image/gif");
		return IOUtils.toByteArray(servletContext.getResourceAsStream("/images/ajax.gif"));
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
