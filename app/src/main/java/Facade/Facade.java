package Facade;

import java.io.IOException;
import java.net.http.HttpResponse;

public class Facade {
    private HttpQuery query = new HttpQuery();
    public String getAttributeValueFromJson(String urlString, String attributeName) throws Exception {
        HttpResponse res = query.fetchData(urlString);

        String joke = JsonParser.extractJokeFromJson(res, attributeName);

        return joke;
    };
}
