package net.marioosh.gallery.utils;

import javax.servlet.http.HttpServletRequest;
import org.springframework.webflow.context.servlet.DefaultFlowUrlHandler;
import org.springframework.webflow.core.collection.AttributeMap;

/**
 * pomocniczy handler zeby usunac '/app' z url przy obsludze przez flow controllera 
 * @author marioosh
 *
 */
public class PrettyFlowUrlHandler extends DefaultFlowUrlHandler {

	@Override
	public String createFlowDefinitionUrl(String flowId, AttributeMap input,
			HttpServletRequest request) {
		return cleanUrl(super.createFlowDefinitionUrl(flowId, input, request), request);
	}

	@Override
	public String createFlowExecutionUrl(String flowId,
			String flowExecutionKey, HttpServletRequest request) {
		return cleanUrl(super.createFlowExecutionUrl(flowId, flowExecutionKey, request), request);
	}

	protected String cleanUrl(String url, HttpServletRequest request) {
		String pattern = request.getServletPath().substring(1) + "/";
		return url.replaceFirst(pattern, "");
	}

}
