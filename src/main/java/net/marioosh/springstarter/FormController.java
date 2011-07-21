package net.marioosh.springstarter;

import javax.validation.Valid;
import net.marioosh.springstarter.model.entities.Photo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("photo")
public class FormController {
	
	private Logger log = Logger.getLogger(FormController.class);
	
	/*
	@ModelAttribute("photo")
	public Photo getPhoto() {
		return new Photo();
	}

	@Autowired
	private Validator validator;
	*/
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("photo", new Photo());
		return "form";
	}
	
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String form(@Valid // bean validator 
			@ModelAttribute Photo photo, BindingResult result) {
		ValidationUtils.rejectIfEmpty(result, "id", "not.empty");
		log.debug(photo);
		return "form";
	}	
	
}
