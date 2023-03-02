package test_apis;

import almosafer_apis.GetLookUpApi;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static ApiConstants.Constants.CODE_200;
import static object_mappers.LookUpMapper.readLookUpObjects;
@Listeners
public class GetLookUpTest {
    Response lookUpResponse;

    @Test(description = "verify Get Lookup Api with valid data is working as expected")
    public void verifyGetLookupApiWithValidData() {
        GetLookUpApi getLookUpApi = new GetLookUpApi();

        lookUpResponse = getLookUpApi.callGetLookUpApi();

        Assert.assertEquals(lookUpResponse.getStatusCode(), CODE_200);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotNull(readLookUpObjects(getLookUpApi.apiResponse).getFacilityCategory());
        softAssert.assertNotNull(readLookUpObjects(getLookUpApi.apiResponse).getChains());
        softAssert.assertNotNull(readLookUpObjects(getLookUpApi.apiResponse).getFacilityTags());
        softAssert.assertNotNull(readLookUpObjects(getLookUpApi.apiResponse).getFacilities());
        softAssert.assertNotNull(readLookUpObjects(getLookUpApi.apiResponse).getPropertyTypes());
        softAssert.assertNotNull(readLookUpObjects(getLookUpApi.apiResponse).getBrands());
        softAssert.assertNotNull(readLookUpObjects(getLookUpApi.apiResponse).getPolicyCategories());
        softAssert.assertNotNull(readLookUpObjects(getLookUpApi.apiResponse).getReviewScale());
        softAssert.assertNotNull(readLookUpObjects(getLookUpApi.apiResponse).getImageCategories());
        softAssert.assertNotNull(readLookUpObjects(getLookUpApi.apiResponse).getDescriptionCategories());
        softAssert.assertAll();

    }
}