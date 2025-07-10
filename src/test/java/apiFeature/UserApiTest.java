package apiFeature;

import io.restassured.response.Response;
import org.example.Api.Response.jsonplaceholderResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserApiTest {

    String baseUri = "https://jsonplaceholder.typicode.com";
    String endpoint = "/posts/1";
    @Test
    public void testApi(){
        Response response=ApiRequestHelper.get(baseUri,endpoint,null,null);
        jsonplaceholderResponse user = response.as(jsonplaceholderResponse.class);

        System.out.println("userId: " + user.getUserId());
        System.out.println("id: " + user.getId());
        System.out.println("title: " + user.getTitle());
        System.out.println("body: " + user.getBody());

    }
}
