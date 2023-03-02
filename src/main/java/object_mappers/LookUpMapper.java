package object_mappers;

import apis_objects.LookUpObjects;
import apis_objects.SearchApiObjects;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

public class LookUpMapper {

    public static LookUpObjects readLookUpObjects(Response response) {
        String json = response.getBody().prettyPrint();
        ObjectMapper mapper = new ObjectMapper();
        LookUpObjects lookUpObjects;
        try {
            lookUpObjects = mapper.readValue(json, LookUpObjects.class);
            return lookUpObjects;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
