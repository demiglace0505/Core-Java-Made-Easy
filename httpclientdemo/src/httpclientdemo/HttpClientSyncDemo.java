package httpclientdemo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientSyncDemo {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities"))
				.GET().build();
		
		request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities"))
			.POST(BodyPublishers.ofString("{\r\n"
					+ "  \"id\": 0,\r\n"
					+ "  \"title\": \"string\",\r\n"
					+ "  \"dueDate\": \"2022-02-19T13:22:14.066Z\",\r\n"
					+ "  \"completed\": true\r\n"
					+ "}")).header("Content-type", "application/json").build();
		
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println("status:" + response.statusCode());
		System.out.println(response.body());
		HttpHeaders headers = response.headers();
		System.out.println(headers.map());
	}
}
