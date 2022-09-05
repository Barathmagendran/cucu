package com.googleapi.resources;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class CommonUtils {
	public static RequestSpecification req;
	public 	RequestSpecification request() {
		if(req==null) {
		 req = given().baseUri("https://rahulshettyacademy.com").contentType(ContentType.JSON)
		.queryParam("key","qaclick123");
		}
		return req;
	}

}
