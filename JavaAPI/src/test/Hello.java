package test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello() {
		String resources = "<?xml version='1.0' ?>" + 
	"<hello> Hi from XML </hello>";
		return resources;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJson() {
		String resources = null;
		return resources;
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML() {
		String resources = "<h1> Hi From HTML </h1>";
		return resources;
	}

}
