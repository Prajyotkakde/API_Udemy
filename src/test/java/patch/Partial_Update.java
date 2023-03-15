package patch;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Partial_Update 
{
	@Test
    public void update_partial()
    {
    	String body = "{\n" +
                "   \"name\":\"morpheus\",\n" +
                "   \"job\":\"zion resident\"\n" +
                "}";
    	RestAssured.baseURI="https://reqres.in/api/";
    	Response res = given().header("Content-Type","application/json").body(body)
    	       .when().patch("/user/2")
    	       .then().extract().response();
    	
    	System.out.println(res.statusCode());
    	System.out.println(res.asString());
    	
    	
    	       
    	
    }
}