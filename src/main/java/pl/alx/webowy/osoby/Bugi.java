package pl.alx.webowy.osoby;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/osoby/bugi")
public class Bugi {

	@GET
	@Produces("text/html;charset=UTF-8")
	public String getHtml() {
		return """
		<!DOCTYPE html>
		<html>
		<head>
		  <title>Bugi</title>
		</head>
		<body>
		<p>Jestem <strong>Bugi</strong></p>
		</body>
		</html>
		""";
	}
}
