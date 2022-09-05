package com.googleapi.stepdefinations;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.googleapi.dataprovider.AppResponse;
import com.googleapi.dataprovider.location;
import com.googleapi.resources.CommonUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class GoogleApi extends CommonUtils{
	CommonUtils c=new CommonUtils();
	
	
	AppResponse app;
	@Given("User want add my payload")
	public void user_want_add_my_payload() {
		 app=new AppResponse();
		app.setAccuracy(50);
		app.setAddress("No:95 ponneri,TamilNadu");
		app.setLanguage("Tamil");
		app.setName("Barath");
		app.setPhone_number("987654321");
		app.setWebsite("www.houseforrent.com");
		location lc=new location();
		lc.setLat(33.7676);
		lc.setLng(67.7766);
		app.setLocation(lc);
		List<String> l=new ArrayList<String>();
		l.add("Shoe park");
		l.add("Park");
		app.setTypes(l);
	    
	}
	io.restassured.response.Response response;
	@When("User submit {string} API")
	public void user_submit_API(String string) {
    c.request();
	 response =req .body(app)
    .when().post("/maps/api/place/add/json")
    .then().log().all().assertThat().statusCode(200).extract().response();
   

				        
	}

	@Then("User want to assert the status code is {int}")
	public void user_want_to_assert_the_status_code_is(Integer int1) {
	    int int2 = response.getStatusCode();
	    String v = String.valueOf(int2);
	   Assert.assertEquals(int1.toString(), v);
	}



}
