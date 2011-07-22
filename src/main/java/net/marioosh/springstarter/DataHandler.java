package net.marioosh.springstarter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.marioosh.springstarter.model.entities.User;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.webflow.execution.FlowExecutionOutcome;
import org.springframework.webflow.mvc.servlet.AbstractFlowHandler;

/**
 * Customized Flow Handler
 * nazwa beana musi sie zgadzac z id flowa, w tym przypadku 'test'
 * odnosi sie do test flowa
 * @author marioosh
 *
 */
@Component("test")
public class DataHandler extends AbstractFlowHandler {
	
	private Logger log = Logger.getLogger(DataHandler.class);
	
	@Override
	public String handleExecutionOutcome(FlowExecutionOutcome outcome,
			HttpServletRequest request, HttpServletResponse response) {
		log.debug(outcome.getId());
		User user = (User)outcome.getOutput().get("outuser");

		return "/home";
	}

}
