package net.marioosh.gallery.utils;

import net.marioosh.gallery.MainController;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * odpalanie win32
 * 		java -cp *; net.marioosh.gallery.utils.AdminTool
 * 		java -cp target\gallery\WEB-INF\lib\*; net.marioosh.gallery.utils.AdminTool
 * 		java -cp target\gallery\WEB-INF\lib\*;c:\jsf\tomcat-6.0.26\lib\*; net.marioosh.gallery.utils.AdminTool
 * 
 * odpalanie linux
 * 		java -cp target/gallery/WEB-INF/lib/*:/opt/tomcat7/lib/* net.marioosh.gallery.utils.AdminTool
 * 
 * @author marioosh
 *
 */
public class AdminTool {

	private Logger log = Logger.getLogger(getClass());
	
	private MainController mainController;
	
	/**
	 * application context
	 */
	// private static final FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/config/applicationContext.xml");
	private static final ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

	static public void main(String[] args) {
		new AdminTool();
	}
	
	public AdminTool() {
		this.mainController = (MainController)ac.getBean("mainController");
	}

}
