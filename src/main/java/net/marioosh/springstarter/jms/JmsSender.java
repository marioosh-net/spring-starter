package net.marioosh.springstarter.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import net.marioosh.springstarter.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jms")
public class JmsSender {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	@RequestMapping("/send")
	public String send() {
		jmsTemplate.send("queue", new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(new User("jacek", "haslo"));
			}
		});
		return "index";
	}
}
