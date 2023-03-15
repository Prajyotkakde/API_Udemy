package put_Update;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.junit.Test;

public class Update_Put 
{
	@Test
    public void put_update()
    {
    	String body="{\n" +
                "   \"name\":\"Pankaj\",\n" +
                "   \"job\":\"zion resident\"\n" +
                "}";

    	RestAssured.baseURI="https://reqres.in/api/";
    	Response res = given().header("Content-Type","application/json").body(body)
    	       .when().put("/user/2")
    	       .then().extract().response();
    	
    	System.out.println(res.statusCode());
    	System.out.println(res.asString());
    	
    }
}
