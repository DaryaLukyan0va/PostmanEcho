package ru.netology.post;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostmanTest {
    @Test
            void verificationTest() {


        given()
                .baseUri("https://postman-echo.com")
                .body("some value")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("some value"));

    }
}
