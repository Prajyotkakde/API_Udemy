package live_Application;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Twitter 
{
	   String consumerKey="7Vq0UbrScOUiaAFGbNFVkssg5";
	   String consumerSecrete="c8JhiSCq6rLrmn2cRMVVggHMwcHxsfwdy4NkLMdLbHIjT0STgv";
	   String Token="2rthpniy2ihcE7Efddae49DqEocNG5lOo1mQCtcI";
	   String TokenSecrete="X5uZKLDcrtECWX2iWUJXgUt4s4Zre0M75rTT5Wse5pwHI";
@Test
   public void get()
   {
	   RestAssured.baseURI="https://api.twitter.com/2/tweets/search/recent";
	  Response res = given().auth().oauth(consumerKey, consumerSecrete, Token, TokenSecrete)
	          .queryParam("status", "Creating Tweets via API Automation Testing")
	   .when().post("/update.json")
	   .then().extract().response();
	  
	  System.out.println(res.statusCode());
	  System.out.println(res.asString());
   }


}
