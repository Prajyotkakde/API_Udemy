package delete;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Delete_Method 
{
	@Test
   public void delete_method ()
   {
	   RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	   Response res = given()
	          .when().delete("delete/2")
	          .then().extract().response();
	   
	   System.out.println(res.statusCode());
	   System.out.println(res.asString());
	   
   }
}
