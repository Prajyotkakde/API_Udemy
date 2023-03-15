package api_U;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.junit.Test;

public class API_Test {
 
	@Test
	public void getuser()
	{
		RestAssured.baseURI="https://reqres.in/api";
		Response res = given()
		       .when().get("/users/2")
		       .then().extract().response();
		
		
	    int statuscode = res.statusCode();
	    System.out.println(statuscode);
	    
	    String response = res.asString();
	    System.out.println(response);
	}
}
