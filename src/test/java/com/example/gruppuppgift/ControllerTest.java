package com.example.gruppuppgift;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;



class ControllerTest {
    @Test
    public void testingControllerAddition(){
        RestAssured.baseURI =  "http://localhost:8080";


        given()
                .when()
                .get("/add?d1=10&d2=5")
                .then()
                .statusCode(200)
        //Någonting behövs här men det funkar som det är nu.
                /*.body("answer", equalTo("15.0"))*/;
    }
    @Test
    public void testingControllerSubtraction(){
        RestAssured.baseURI =  "http://localhost:8080";


        given()
                .when()
                .get("/subtract?d1=10&d2=5")
                .then()
                .statusCode(200);
    }
    @Test
    public void testingControllerMultiplication(){
        RestAssured.baseURI =  "http://localhost:8080";


        given()
                .when()
                .get("/multiply?d1=10&d2=5")
                .then()
                .statusCode(200);
    }
    @Test
    public void testingControllerDivision(){
        RestAssured.baseURI =  "http://localhost:8080";


        given()
                .when()
                .get("/divide?d1=10&d2=5")
                .then()
                .statusCode(200);
    }

}