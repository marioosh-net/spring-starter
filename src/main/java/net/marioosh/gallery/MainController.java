package net.marioosh.gallery;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import net.marioosh.gallery.model.dao.PhotoDAO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	private Logger log = Logger.getLogger(MainController.class);

	@Autowired
	private Validator validator;

	@Autowired
	private PhotoDAO photoDAO;

	@Autowired
	private UtilService utilService;
	
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

	@RequestMapping(value={"/home", "/"})
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
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception ex) throws IOException {
		log.error(ex.getMessage(), ex);
		return new ModelAndView("error", "message", ex.getMessage());
	}	

}
