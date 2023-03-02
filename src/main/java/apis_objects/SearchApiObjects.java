package apis_objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class SearchApiObjects {

    @JsonProperty("searchId")
    private JsonNode searchId;
    @JsonProperty("searchIdExpiry")
    private JsonNode searchIdExpiry;
    @JsonProperty("checkIn")
    private JsonNode checkIn;
    @JsonProperty("checkOut")
    private JsonNode checkOut;
    @JsonProperty("totalCount")
    private JsonNode totalCount;
    @JsonProperty("pageNo")
    private JsonNode pageNo;
    @JsonProperty("pageSize")
    private JsonNode pageSize;
    @JsonProperty("currencyCode")
    private JsonNode currencyCode;
    @JsonProperty("properties")
    private JsonNode properties;
    @JsonProperty("filters")
    private JsonNode filters;

    public JsonNode getSearchId() {return searchId;}
    public JsonNode getSearchIdExpiry() {return searchIdExpiry;}
    public JsonNode getCheckIn() {return checkIn;}
    public JsonNode getCheckOut() {return checkOut;}
    public JsonNode getTotalCount() {return totalCount;}
    public JsonNode getPageNo() {return pageNo;}
    public JsonNode getPageSize() {return pageSize;}
    public JsonNode getCurrencyCode() {return currencyCode;}
    public JsonNode getProperties() {return properties;}
    public JsonNode getFilters() {return filters;}
}
