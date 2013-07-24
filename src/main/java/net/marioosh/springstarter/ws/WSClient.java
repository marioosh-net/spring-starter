package net.marioosh.springstarter.ws;

import java.util.Random;
import net.webservicex.AccelerationUnitSoap;
import net.webservicex.Accelerations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WSClient {
	
	/**
	 * zdalny web service jako lokala usluga
	 */
	@Autowired
	AccelerationUnitSoap accelerationUnitWS;
	
	@RequestMapping("/testWS")
	public String testRemoteWS(Model model) {
		model.addAttribute("acc", accelerationUnitWS.changeAccelerationUnit(new Random().nextDouble(), Accelerations.CENTIGAL, Accelerations.CENTIMETER_PERSQUARESECOND));
		return "index";
	}
}
