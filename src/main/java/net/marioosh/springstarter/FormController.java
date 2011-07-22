package net.marioosh.springstarter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import net.marioosh.springstarter.model.dao.UserDAO;
import net.marioosh.springstarter.model.entities.User;
import org.apache.commons.validator.EmailValidator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class FormController {

	private Logger log = Logger.getLogger(FormController.class);

	@Autowired
	private UserDAO userDAO;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	@ModelAttribute("users")
	public List<User> getUsers() {
		return userDAO.findAll();
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("user", new User());
		return "form";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String form(/* bean validator */ @Valid @ModelAttribute User user, BindingResult result) {
		
		// 1
		ValidationUtils.rejectIfEmpty(result, "firstname", "not.empty");
		
		// 2
		if(userDAO.getByLogin(user.getLogin()) != null) {
			result.rejectValue("login", "loginEexist");
		}
		
		// 3
		if(!EmailValidator.getInstance().isValid(user.getEmail())) {
			result.rejectValue("email", "emailInvalid");
		}
		
		log.debug(user);
		log.debug(user.getDate());
		
		if(result.hasErrors()) {
			for(ObjectError e: result.getAllErrors()) {
				log.debug(e.getObjectName() + ","+ e.getCode() + ","+e.getDefaultMessage());
			}
			log.debug("errors!");
			return "form";
		}
		
		userDAO.add(user);
		return "redirect:/app/form";
	}

}
