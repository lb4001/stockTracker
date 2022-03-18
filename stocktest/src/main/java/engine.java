import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.net.http.*;


public class engine {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        finnHubWrapper my = new finnHubWrapper();
        my.getQuote("TSLA");
    }

}


