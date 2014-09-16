package sample.hello.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloResource {
	@GET
	@Path("sayHello")
	public String sayHello() {
		System.out.println("xx");
		return "{\"name\":\"Hello Jersey3333\"}";
	}
}
