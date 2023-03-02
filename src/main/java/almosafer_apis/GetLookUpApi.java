package almosafer_apis;

import io.restassured.response.Response;
import base.Base;

import static utils.PropReader.readConfig;

public class GetLookUpApi extends Base {



    String url = readConfig("url") + "/enigma/hotel/lookup";
    public Response apiResponse;

    public Response callGetLookUpApi() {
        baseURL(url);
        apiResponse = httpRequest().when()
                .header("token", "skdjfh73273$7268u2j89s")
                .get()
                .then()
                .extract()
                .response();

        return apiResponse;
    }
}
