package pl.alx.webowy.osoby;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/osoby/ala")
public class Ala {

	@GET
	@Produces("text/html;charset=UTF-8")
	public String getHtml() {
		return """
		<!DOCTYPE html>
		<html>
		<head>
		  <title>Ala</title>
		</head>
		<body>
		<p>Jestem <strong>Ala</strong></p>
		</body>
		</html>
		""";
	}
}
