package postMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.junit.Test;

public class CreatePost 
{
	@Test
   public void post_Create()
   {
	   String body = "{\n" +
               "\t\"name\":\"test\",\n" +
               "\t\"salary\":\"123\",\n" +
               "\t\"age\":\"23\"\n" +
               "}";

	   RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	   Response res = given().header("Content-Type","application/json")
	          .body(body)
	          .when().post("/create")
	          .then().extract().response();
	  
	  String response = res.asString();
	  System.out.println(response);
	  System.out.println("Status code is---->"+res.statusCode());
   }
}
