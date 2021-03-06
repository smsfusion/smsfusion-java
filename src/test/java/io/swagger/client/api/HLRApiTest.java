/*
 * SMS Fusion API
 * This is the SMS Fusion API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@smsfusion.com.au
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.HLRCallback;
import io.swagger.client.model.HLRError;
import io.swagger.client.model.HLRResult;
import io.swagger.client.model.OutOfCredit;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HLRApi
 */
@Ignore
public class HLRApiTest {

    private final HLRApi api = new HLRApi();

    
    /**
     * HLR number lookup
     *
     * Perform HLR on number
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHLRTest() throws ApiException {
        String key = null;
        String num = null;
        String cc = null;
        HLRCallback response = api.getHLR(key, num, cc);

        // TODO: test validations
    }
    
    /**
     * HLR number lookup with results going to a callback URL
     *
     * Perform HLR on number with the result being sent to the callback URL provided
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHLRCallbackTest() throws ApiException {
        String key = null;
        List<String> num = null;
        String cb = null;
        String cc = null;
        HLRResult response = api.getHLRCallback(key, num, cb, cc);

        // TODO: test validations
    }
    
}
