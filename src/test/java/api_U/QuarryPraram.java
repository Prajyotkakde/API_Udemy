package api_U;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.junit.Test;

public class QuarryPraram 
{
	@Test
  public void quarryparam()
  {
	  RestAssured.baseURI="https://reqres.in/api";
	  Response res = given().queryParam("Page", "2")
	         .when().get("/user")
	         .then().extract().response();
	  
	  int sc = res.statusCode();
	  System.out.println(sc);
	  
	  String response = res.asString();
	  System.out.println(response);
  }
}
