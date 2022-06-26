package eu.miaplatform.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class CPStatusTest {

    @Test
    public void heathTest() {
        given()
                .when().get("/-/healthz")
                .then()
                .statusCode(200);
    }

    @Test
    public void readyTest() {
        given()
                .when().get("/-/ready")
                .then()
                .statusCode(200);
    }

    @Test
    public void checkUpTest() {
        given()
                .when().get("/-/check-up")
                .then()
                .statusCode(200);
    }

}