package api;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ExecTest2 {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void getListOfUsersAndCheckEmails() {

        List<UserData> getListAndCheckEmail = given()
                .when()
                .contentType(ContentType.JSON)
                .get(BASE_URL + "api/users?page=1")
                .then()
                .log().all()
                .extract()
                .body()
                .jsonPath()
                .getList("data", UserData.class);

        getListAndCheckEmail.stream().forEach(a-> Assert.assertTrue(a.getEmail().endsWith("@reqres.in")));
    }
}
