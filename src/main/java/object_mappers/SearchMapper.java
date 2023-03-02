package object_mappers;

import apis_objects.SearchApiObjects;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

public class SearchMapper {

    public static SearchApiObjects readSearchApiObjects(Response response) {
        String json = response.getBody().prettyPrint();
        ObjectMapper mapper = new ObjectMapper();
        SearchApiObjects searchApiObjects;
        try {
            searchApiObjects = mapper.readValue(json, SearchApiObjects.class);
            return searchApiObjects;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
