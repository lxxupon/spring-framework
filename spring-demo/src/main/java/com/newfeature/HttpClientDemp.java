package com.newfeature;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemp {

	public static void main(String[] args) throws Exception {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(new java.net.URI("https://api.github.com"))
				.header("Accept", "application/vnd.github.v3+json")
				.build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("Response Code: " + response.statusCode());
		System.out.println("Response Body: " + response.body());
	}
}
