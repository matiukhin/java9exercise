package com.java9.test;

import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HttpClient {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        URI uri = new URI("https://google.com");
        jdk.incubator.http.HttpClient httpClient = jdk.incubator.http.HttpClient
                .newBuilder()
                .followRedirects(jdk.incubator.http.HttpClient.Redirect.SAME_PROTOCOL)
                .build();

        HttpResponse<String> httpResponse = httpClient.send(HttpRequest.newBuilder(uri).GET().build(), HttpResponse.BodyHandler.asString());
        System.out.println(httpResponse.body());
    }
}
