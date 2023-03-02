package apis_objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class LookUpObjects {
    @JsonProperty("facilityCategory")
    private JsonNode facilityCategory;
    @JsonProperty("chains")
    private JsonNode chains;
    @JsonProperty("facilityTags")
    private JsonNode facilityTags;
    @JsonProperty("facilities")
    private JsonNode facilities;
    @JsonProperty("propertyTypes")
    private JsonNode propertyTypes;
    @JsonProperty("brands")
    private JsonNode brands;
    @JsonProperty("policyCategories")
    private JsonNode policyCategories;
    @JsonProperty("reviewScale")
    private JsonNode reviewScale;
    @JsonProperty("imageCategories")
    private JsonNode imageCategories;
    @JsonProperty("descriptionCategories")
    private JsonNode descriptionCategories;

    public JsonNode getFacilityCategory() {return facilityCategory;}
    public JsonNode getChains() {return chains;}
    public JsonNode getFacilityTags() {return facilityTags;}
    public JsonNode getFacilities() {return facilities;}
    public JsonNode getPropertyTypes() {return propertyTypes;}
    public JsonNode getBrands() {return brands;}
    public JsonNode getPolicyCategories() {return policyCategories;}
    public JsonNode getReviewScale() {return reviewScale;}
    public JsonNode getImageCategories() {return imageCategories;}
    public JsonNode getDescriptionCategories() {return descriptionCategories;}
}
