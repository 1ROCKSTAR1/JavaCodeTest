package test;

import model.User;
import org.testng.annotations.Test;
import rest.TestBase;

public class UserRegTest extends TestBase {

    @Test
    public void createUserTest() {
        testClient.create(User.defaultOf())
                .checkStatusCode(200);
    }


}
