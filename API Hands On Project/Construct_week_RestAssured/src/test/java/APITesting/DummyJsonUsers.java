package APITesting;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class DummyJsonUsers {

	String token= "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3MjE0Njk5ODksImV4cCI6MTcyNDA2MTk4OX0.o5UR5_jFsGBWiV_BD27D0OpgAg6CWxVhZxKLLBmDmgM";

    @Test
    public void GetAllUser() {
       
		given().when().get("https://dummyjson.com/users").then().statusCode(200).log().all();
    }
    
    @Test
    public void loginUser() {
       
    	
    	//refresh token= "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3MjE0Njk5ODksImV4cCI6MTcyNDA2MTk4OX0.o5UR5_jFsGBWiV_BD27D0OpgAg6CWxVhZxKLLBmDmgM"
    	//token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3MjE0Njk5ODksImV4cCI6MTcyMTQ3MzU4OX0.RiRXIE9o5MMgkRGoAiHICP8gmAXwd5znSTbJQ_xZLzE"
    	JSONObject json=new JSONObject();
    	json.put("username", "emilys");
    	json.put("password", "emilyspass");
    	
    	given().contentType(ContentType.JSON).body(json).post("https://dummyjson.com/user/login")
        .then().statusCode(200).log().all();    
    }
    
    @Test
    public void GetCurrentUser() {
       
    	
    	//refresh token= "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3MjE0Njk5ODksImV4cCI6MTcyNDA2MTk4OX0.o5UR5_jFsGBWiV_BD27D0OpgAg6CWxVhZxKLLBmDmgM"
    	//token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3MjE0Njk5ODksImV4cCI6MTcyMTQ3MzU4OX0.RiRXIE9o5MMgkRGoAiHICP8gmAXwd5znSTbJQ_xZLzE"
    	
    	given().header("Authorization", "Bearer "+token).contentType(ContentType.JSON).get("https://dummyjson.com/user/me")
        .then().statusCode(200).log().all();    
    }
    
    @Test
    public void GetSingleUser() {
       
    	
    	given().when().get("https://dummyjson.com/users/1").then().statusCode(200).log().all();
    }
    
    @Test
    public void SearchUser() {
       
    	
    	given().when().get("https://dummyjson.com/users/search?q=John").then().statusCode(200).log().all();
    }
    
    @Test
    public void FilterUser() {
       
    	
    	given().when().get("https://dummyjson.com/users/filter?key=hair.color&value=Brown").then().statusCode(200).log().all();
    }
    
    @Test
    public void LimitAndSkipUser() {
       
    	
    	given().when().get("https://dummyjson.com/users?limit=5&skip=10&select=firstName,age").then().statusCode(200).log().all();
    }
    
    @Test
    public void LimitAndSkipUser2() {
       
    	
    	given().when().get("https://dummyjson.com/users?sortBy=firstName&order=asc").then().statusCode(200).log().all();
    }
    
    @Test
    public void GetUsersCartsByyUserId() {
       
    	
    	given().when().get("https://dummyjson.com/users/6/carts").then().statusCode(200).log().all();
    }
    
    @Test
    public void GetUsersPostByyUserId() {
       
    	
    	given().when().get("https://dummyjson.com/users/5/posts").then().statusCode(200).log().all();
    }
    
    @Test
    public void GetUsersTodoByyUserId() {
       
    	
    	given().when().get("https://dummyjson.com/users/5/todos").then().statusCode(200).log().all();
    }
    
    @Test
    public void AddNewUser() {
       
    	JSONObject json=new JSONObject();
    	json.put("firstName", "Muhammad");
    	json.put("lastName", "Ovi");
    	json.put("age", 250);

    	given().contentType(ContentType.JSON).body(json).when().post("https://dummyjson.com/users/add").then().statusCode(201).log().all();
    }
    
    @Test
    
    public void UpdateUser() {
        
    	JSONObject json=new JSONObject();
    	
    	json.put("lastName", "Owais");
    	

    	given().contentType(ContentType.JSON).body(json).when().put("https://dummyjson.com/users/2").then().statusCode(200).log().all();
    }
    
 @Test
    
    public void DeleteUser() {
        

    	given().contentType(ContentType.JSON).when().delete("https://dummyjson.com/users/1").then().statusCode(200).log().all();
    }
}
