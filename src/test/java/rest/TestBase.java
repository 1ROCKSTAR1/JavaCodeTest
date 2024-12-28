package rest;

public class TestBase {

    protected static TestClient testClient;

    static {
        testClient = new TestClient();
    }
}
