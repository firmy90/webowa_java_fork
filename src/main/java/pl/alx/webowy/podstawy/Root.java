package pl.alx.webowy.podstawy;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Root {

	@GET
	@Produces("text/html;charset=UTF-8")
	public String index_html() {
		return """
		<!DOCTYPE html>
		<html>
		<head>
		  <title>Aplikacja</title>
		</head>
		<body>
		<h1>Aplikacja - strona główna</h1>
		<h2>Proste przykłady</h2>
		<ul>
		<li><a href="hello">Hello</a></li>
		<li><a href="licz/2+3">2+3</a></li>
		<li><a href="licz/7*3">7*3</a></li>
		</ul>

		<h2>Osoby wpisują</h2>
		<ul>
		<li><a href="osoby/ala">Ala</a></li>
		<li><a href="osoby/bugi">Bugi</a></li>
		</ul>
		</body>
		</html>
		""";
	}
}
