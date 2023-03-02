package test_apis;

import almosafer_apis.PostSearchApi;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static ApiConstants.Constants.*;
import static object_mappers.SearchMapper.readSearchApiObjects;
import static utils.XMLReader.getXMLData;

@Listeners
public class PostSearchTest {
    Response searchResponse;
    @Test(description = "verify Post Search Api with valid data is working as expected")
        public void verifyPostSearchApiWithValidData(){
            PostSearchApi postSearchApi=new PostSearchApi();

            searchResponse =postSearchApi.callPostSearchApi(getXMLData("checkIn"),getXMLData("checkOut"));

            Assert.assertEquals(searchResponse.getStatusCode(), CODE_200);

            SoftAssert softAssert=new SoftAssert();
            softAssert.assertNotNull(readSearchApiObjects(postSearchApi.apiResponse).getSearchId().asText());
            softAssert.assertNotNull(readSearchApiObjects(postSearchApi.apiResponse).getSearchIdExpiry().asInt());
            softAssert.assertEquals(readSearchApiObjects(postSearchApi.apiResponse).getCheckIn().asText(),getXMLData("checkIn"));
            softAssert.assertEquals(readSearchApiObjects(postSearchApi.apiResponse).getCheckOut().asText(),getXMLData("checkOut"));
            softAssert.assertNotNull(readSearchApiObjects(postSearchApi.apiResponse).getTotalCount().asText());
            softAssert.assertNotNull(readSearchApiObjects(postSearchApi.apiResponse).getPageNo().asText());
            softAssert.assertNotNull(readSearchApiObjects(postSearchApi.apiResponse).getPageSize().asText());
            softAssert.assertEquals(readSearchApiObjects(postSearchApi.apiResponse).getCurrencyCode().asText(),CURRENCY);
            softAssert.assertNotNull(readSearchApiObjects(postSearchApi.apiResponse).getProperties().asText());
            softAssert.assertNotNull(readSearchApiObjects(postSearchApi.apiResponse).getFilters().asText());
            softAssert.assertAll();

        }
}
