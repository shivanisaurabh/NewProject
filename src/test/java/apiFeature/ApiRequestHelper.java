package apiFeature;

import io.restassured.RestAssured;
import io.restassured.response.Response;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class ApiRequestHelper {

    public static Response get(String baseUri, String endpoint, HashMap<String, String> headers, HashMap<String, String> queryParams) {
        return given()
                .baseUri(baseUri)
                .headers(headers != null ? headers : new HashMap<>())
                .queryParams(queryParams != null ? queryParams : new HashMap<>())
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();

    }

    public static Response getWithPathParams(String baseUri, String endpoint, Map<String, String> headers, Map<String, String> pathParams) {
        return given()
                .baseUri(baseUri)
                .headers(headers != null ? headers : new HashMap<>())
                .pathParams(pathParams != null ? pathParams :new HashMap<>())
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response post(String baseUri, String endpoint, Map<String, String> headers, Object body) {
        return given()
                .baseUri(baseUri)
                .headers(headers != null ? headers : new HashMap<>())
                .contentType(JSON)
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response put(String baseUri, String endpoint, Map<String, String> headers, Object body) {
        return given()
                .baseUri(baseUri)
                .headers(headers != null ? headers :new HashMap<>())
                .contentType(JSON)
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response delete(String baseUri, String endpoint, Map<String, String> headers) {
        return given()
                .baseUri(baseUri)
                .headers(headers != null ? headers : new HashMap<>())
                .when()
                .delete(endpoint)
                .then()
                .extract()
                .response();
    }
}
