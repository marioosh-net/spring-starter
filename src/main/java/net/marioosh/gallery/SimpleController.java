package net.marioosh.gallery;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import net.marioosh.gallery.model.dao.PhotoDAO;
import net.marioosh.gallery.model.entities.Photo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("photo")
public class SimpleController {
	
	private Logger log = Logger.getLogger(SimpleController.class);
	
	/*
	@ModelAttribute("photo")
	public Photo getPhoto() {
		return new Photo();
	}

	@Autowired
	private Validator validator;
	*/
	
	@RequestMapping(value="/simple", method=RequestMethod.GET)
	public String simple(Model model) {
		model.addAttribute("photo", new Photo());
		return "simple";
	}
	
	@RequestMapping(value="/simple", method=RequestMethod.POST)
	public String simple(@Valid // bean validator 
			@ModelAttribute Photo photo, BindingResult result) {
		ValidationUtils.rejectIfEmpty(result, "id", "not.empty");
		log.debug(photo);
		return "simple";
	}	
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception ex) throws IOException {
		log.error(ex.getMessage(), ex);
		return new ModelAndView("error", "message", ex.getMessage());
	}	

}
