package com.epam.task.gradle;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstClassInAPIUtils {
    public String sendGetRequest(String url){
        Response response = RestAssured.get(url);
        return response.body().toString();
    }
}
