package com.canavast.www.home;

import static spark.Spark.*;
import spark.servlet.SparkApplication;


/**
 * @author Triston Scallan
 *
 */
public class HomeSparkServlet implements SparkApplication {

	@Override
    public void init() {
		staticFiles.location("/public");
        get("/home", (request, response) -> {response.redirect("index.html"); return null;}); 
        get("/hello/:name", (request, response) -> "Hello " + request.params(":name"));
    }
}
