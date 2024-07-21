package APITesting;

import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class DummyJsonCarts {
	
	@Test
	public void getAllCarts() {
		given().when().get("https://dummyjson.com/carts").then().statusCode(200).log().all();
	}
	
	@Test
	public void SingleCart() {
		given().when().get("https://dummyjson.com/carts/1").then().statusCode(200).log().all();

		
	}
	@Test
	public void GetCartsByUser() {
		given().when().get("https://dummyjson.com/carts/user/5").then().statusCode(200).log().all();

	}
	@Test
	public void addCart() {
		

        // Create the payload
       JSONObject product1 = new JSONObject();
        product1.put("id", 144);
        product1.put("quantity", 4);

        JSONObject product2 = new JSONObject();
        product2.put("id", 98);
        product2.put("quantity", 1);

        JSONObject payload = new JSONObject();
        payload.put("userId", 1);
        payload.put("products", Arrays.asList(product1, product2));

        // Send the POST request
        Response response = RestAssured
        .given().contentType(ContentType.JSON).body(payload).post("https://dummyjson.com/carts/add");
        response.then().statusCode(201).log().all();
                
        
       
	}
	
	@Test
	public void UpdateCarts() {
		
		JSONObject json=new JSONObject();
		json.put("id", 1);
		json.put("quantity", 1);
		
		JSONObject payload=new JSONObject();
		payload.put("merge", true);
		payload.put("products", Arrays.asList(json));
		Response response = RestAssured
		.given().contentType(ContentType.JSON).body(payload).put("https://dummyjson.com/carts/1");
		response.then().statusCode(200).log().all();
		
		
	}
	
	@Test
	public void DeleteCart() {
		
		
		given().contentType(ContentType.JSON).delete("https://dummyjson.com/carts/1")
		.then().statusCode(200).log().all();
		
		
	}


}
