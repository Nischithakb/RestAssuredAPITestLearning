package Day1;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicAPI {

     @Test
    public static void Basictest() {
        // setup base URL for test

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        //perform get method and validate response
        given()                                 // Specify the preconditions
                .when()                             // Specify the action
                .get("/posts/1")                // Perform a GET request to endpoint "/posts/1"
                .then()                             // Specify the response expectations
                .statusCode(200);



    }
}
