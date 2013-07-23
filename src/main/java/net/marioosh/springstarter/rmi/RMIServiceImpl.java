package net.marioosh.springstarter.rmi;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("rmi")
public class RMIServiceImpl implements RMIService {

	Logger log = Logger.getLogger(RMIServiceImpl.class);
	
	public void testRMI() {
		log.info("testing RMI... OK");
	}

}
