package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/demo2")
public class Demo2Controller {

	@Get(uri = "/", produces = "text/plain")
	public String index() {
		return "Example Response";
	}

	@Get(uri = "/tags", produces = "text/plain")
	public Tags tags() {
		return new Tags();
	}
}