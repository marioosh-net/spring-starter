package net.marioosh.springstarter;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Async;

public class RequestBean {
	
	private Logger log = Logger.getLogger(RequestBean.class);
	
	public RequestBean() {
		log.info(this);
	}
	
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
}
