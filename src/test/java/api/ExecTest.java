package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.Random;

public class ExecTest {

    private static final String BASE_URL = "https://reqres.in/";

    String randomEmail = Random.generateRandomEmail();

    @Test
    public void createUserTest() {

        CreateUser user = new CreateUser("eve.holt@reqres.in","pistol");

        RestAssured.given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .body(user)
                .post(BASE_URL + "api/register")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    public void createUserNegativeTest() {

        CreateUser user = new CreateUser(randomEmail,"");

        RestAssured.given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .body(user)
                .post(BASE_URL + "api/register")
                .then()
                .log().all()
                .statusCode(400);
    }
}

