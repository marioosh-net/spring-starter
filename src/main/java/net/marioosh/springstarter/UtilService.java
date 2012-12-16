package net.marioosh.springstarter;

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.Future;

import net.marioosh.springstarter.model.dao.UserDAO;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service("utilService")
public class UtilService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Logger log = Logger.getLogger(UtilService.class);

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

	/**
	 * method with asynchronous execution
	 *
    @Async
    public void async() {
        String threadName = Thread.currentThread().getName();
        log.info("async(" + threadName + ") start");
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        log.info("async(" + threadName + ") DONE");
    }
    */
	
}
