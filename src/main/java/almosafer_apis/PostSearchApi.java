package almosafer_apis;

import base.Base;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.util.HashMap;

import static utils.PropReader.readConfig;
import static utils.XMLReader.getXMLData;


public class PostSearchApi extends Base {
    String url=readConfig("url")+"/accommodation/property/search";
    public Response apiResponse;
    private JSONObject request;

    public Response callPostSearchApi(String checkIn,String checkOut){
        baseURL(url);
        apiResponse= httpRequest().when()
                .headers(Headers(getXMLData("accessToken")))
                .body(requestBody(checkIn,checkOut))
                .post()
                .then()
                .extract()
                .response();

        return apiResponse;
    }

    public String requestBody(String checkIn, String checkOut){
        this.request =new JSONObject("{\n" +
                "    \"searchCriteria\": [\n" +
                "        {\n" +
                "            \"lookupTypeId\": 2,\n" +
                "            \"lookupId\": [\n" +
                "                9\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"checkIn\":"+checkIn+",\n" +
                "    \"checkOut\":"+checkOut+",\n" +
                "    \"sortBy\": \"rank\",\n" +
                "    \"sortOrder\": \"ASC\",\n" +
                "    \"rankType\": \"dynamic\",\n" +
                "    \"pageNo\": 1,\n" +
                "    \"pageSize\": 10\n" +
                "}");
        return this.request.toString();
    }

    public static HashMap<String, String> Headers(String accessToken) {
        HashMap<String, String> headers;
        headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", accessToken);
        return headers;
    }
}
