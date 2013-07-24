package net.marioosh.springstarter.ws;

import javax.jws.WebService;
import net.marioosh.springstarter.model.entities.User;

@WebService(serviceName = "SomeWS")
public interface SomeWebServiceInterface {
	public void showUser(User user);
}
