package model;

import io.restassured.response.Response;
import lombok.SneakyThrows;
import org.hamcrest.Matchers;
import org.testng.Assert;

public class CheckUserResponse {

    private UserResponse model;
    private Response response;

    @SneakyThrows
    public CheckUserResponse(Response response) {
        this.response = response;
        if (!response.asString().isEmpty()) {
            model = response.as(UserResponse.class);
        }
    }
    public CheckUserResponse checkStatusCode(int statusCode) {
        response.then().statusCode(statusCode);

        return this;
    }

    public CheckUserResponse checkIdNotNull() {
        response.then().body("id", Matchers.notNullValue());

        return this;
    }

    public CheckUserResponse checkUser(User expected) {
        Assert.assertEquals(new User(model), expected);

        return this;
    }

    public CheckUserResponse checkId(Integer id) {
        response.then().body("id", Matchers.equalTo(id));
        return this;
    }

    public CheckUserResponse checkErrorResponse(UserResponse expected) {
        response.then().body("timestamp", Matchers.notNullValue());
        Assert.assertEquals(model, expected);

        return this;
    }

    public Integer getId() {
        return response.jsonPath().getInt("id");
    }
}
