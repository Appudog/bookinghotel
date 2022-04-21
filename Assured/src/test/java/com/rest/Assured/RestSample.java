package com.rest.Assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestSample {
	static RequestSpecification reqspec;
	public static void main(String[] args) {
		reqspec = RestAssured.given();
		reqspec = reqspec.header("Content-type","application/Json");
		reqspec = reqspec.queryParam("page","2");
		Response response = reqspec.get("https://reqres.in/api/users");
		int Statuscode = response .getStatusCode();
		System.out.println(Statuscode);
		ResponseBody body = response.getBody();
		String data= body.asString();
		System.out.println(data);
		String asprettystring = body.asPrettyString();
		System.out.println(asprettystring);
	}

}
