package net.marioosh.springstarter.comet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.atmosphere.cpr.Meteor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CometController {
	
	Logger log = Logger.getLogger(getClass());
	
	@RequestMapping("/comet")
	public String test(HttpServletRequest request, HttpServletResponse response) {
		// log.debug(request.getAttribute("org.atmosphere.runtime.AtmosphereResource"));
		
		if(request.getMethod().equalsIgnoreCase("get")) {
			Meteor m = Meteor.build(request, null, null);
			request.getSession().setAttribute("meteor", m);
			m.suspend(-1);
			m.broadcast(request.getServerName() + ", message");
		} else {
	        Meteor m = (Meteor)request.getSession().getAttribute("meteor");
	        response.setCharacterEncoding("UTF-8");
		}
		
		return "comet1";
	}
}
