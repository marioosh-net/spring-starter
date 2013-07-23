package net.marioosh.springstarter.rmi;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("rmiClient")
public class RMIClient {
	
	Logger log = Logger.getLogger(RMIClient.class);
	
	@Autowired
	RMIService rmiService;
	
	@RequestMapping("/testRMI")
	public String testRMI() {
		rmiService.testRMI();
		return "index";
	}
	
}
