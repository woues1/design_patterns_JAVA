package Facade;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;


public class HttpQuery {
    private HttpClient httpClient = HttpClient.newHttpClient();
    public HttpResponse<String> fetchData(String data) throws MalformedURLException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(data))
                .GET()
                .build();

        CompletableFuture<HttpResponse<String>> futureResponse =
                httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        try {
            HttpResponse<String> response = futureResponse.get();
            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    };
}
