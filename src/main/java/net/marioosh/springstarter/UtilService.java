package net.marioosh.springstarter;

import java.io.File;
import java.io.Serializable;
import net.marioosh.springstarter.model.dao.UserDAO;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service("utilService")
public class UtilService implements Serializable, ApplicationContextAware {

	private static final long serialVersionUID = 1L;

	private Logger log = Logger.getLogger(UtilService.class);

	private ApplicationContext appContext;

	@Autowired
	private UserDAO userDAO;

	@Override
	public void setApplicationContext(ApplicationContext appContext)
			throws BeansException {
		this.appContext = appContext;
	}

	public UtilService() {
		log.info(this);
	}

	public String getSeparatorChar() {
		return File.separator;
	}

	/**
	 * scheduled method 
	 */
	@Scheduled(fixedRate=30000)
	public void every30Second() {
		log.info("every30Second()");
	}
}
