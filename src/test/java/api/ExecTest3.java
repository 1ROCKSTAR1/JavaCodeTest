package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class ExecTest3 {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void deleteUser() {
        RestAssured .given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .delete(BASE_URL + "api/users/2")
                .then()
                .log().all()
                .statusCode(204);
    }
}
