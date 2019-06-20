package com.tools.httprequest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostHttp {

    /**
     * post请求
     *
     * @param url        请求地址
     * @param bodystring 提交的数据
     */
    public static Response ptstHttp(String url, String bodystring) {
        Response response = given()
                .contentType("application/json;charset=UTF-8")
                .body(bodystring)
                .post(url);
        return response;
    }


}
