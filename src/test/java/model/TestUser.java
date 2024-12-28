package model;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.AllArgsConstructor;
import org.example.TestConfig;

import static io.restassured.RestAssured.given;

public class TestUser {

    @AllArgsConstructor
    public class TestClient {

        private String baseUri;

        public TestClient() {
            this(TestConfig.Uri.value);
        }

        private RequestSpecification getRequestSpec() {
            return given().
                    baseUri(baseUri).
                    contentType(ContentType.JSON).
                    log().all();
        }

        private RequestSpecification getRequestSpec(Object body) {
            return getRequestSpec().
                    body(body);
        }

        public CheckUserResponse create(User user) {
            Response response = getRequestSpec(user).when().
                    post("/books");

            response.then().log().all();

            return new CheckUserResponse(response);
        }

        public CheckUserResponse read(Integer id) {
            Response response = getRequestSpec()
                    .when()
                    .get("books/{id}", id);

            response.then().log().all();
            return new CheckUserResponse(response);
        }

        public CheckUserResponse update(Integer id, User user) {
            Response response = getRequestSpec(user)
                    .when()
                    .put("/books/{id}", id);

            response.then().log().all();
            return new CheckUserResponse(response);
        }

        public CheckUserResponse delete(Integer id) {
            Response response = getRequestSpec().when().
                    delete("/books/{id}", id);

            response.then().log().all();

            return new CheckUserResponse(response);
        }
    }
}
