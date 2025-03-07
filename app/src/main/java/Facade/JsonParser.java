package Facade;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.http.HttpResponse;

public class JsonParser {

    public static String extractJokeFromJson(HttpResponse<String> res, String attributeName) throws Exception {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(res.body());
        return (String) jsonObject.get(attributeName);
    }
}
