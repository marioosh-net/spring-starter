package net.marioosh.springstarter.ws;

import javax.jws.WebService;
import org.springframework.stereotype.Service;
import net.marioosh.springstarter.model.entities.User;

@Service
public class SomeWebService implements SomeWebServiceInterface {

	@Override
	public void showUser(User user) {
		System.out.println(user);
	}
}
