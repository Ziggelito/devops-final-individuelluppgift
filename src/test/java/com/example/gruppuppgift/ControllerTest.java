package com.example.gruppuppgift;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/add?d1=10&d2=5")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("15.0")));
    }
}

/*
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
                .body(equalTo("15.0"));
    }
    @Test
    public void testingControllerSubtraction(){
        RestAssured.baseURI =  "http://localhost:8080";


        given()
                .when()
                .get("/subtract?d1=10&d2=5")
                .then()
                .statusCode(200)
                .body(equalTo("5.0"));
    }
    @Test
    public void testingControllerMultiplication(){
        RestAssured.baseURI =  "http://localhost:8080";


        given()
                .when()
                .get("/multiply?d1=10&d2=5")
                .then()
                .statusCode(200)
                .body(equalTo("50.0"));
        System.out.println("multiTest");
    }
    @Test
    public void testingControllerDivision(){
        RestAssured.baseURI =  "http://localhost:8080";


        given()
                .when()
                .get("/divide?d1=10&d2=5")
                .then()
                .statusCode(200)
                .body(equalTo("2.0"));
    }

}*/