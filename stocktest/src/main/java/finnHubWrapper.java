import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.net.http.*;


public class finnHubWrapper {
//test stuff

    String getQuote(String ticker) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        String uri = "https://finnhub.io/api/v1/quote?symbol="+ticker;

        HttpRequest request = HttpRequest.newBuilder(new URI(uri))
                .header("X-Finnhub-Token", My.key)
                .GET()
                .build();

         HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        return response.body();
    }


}