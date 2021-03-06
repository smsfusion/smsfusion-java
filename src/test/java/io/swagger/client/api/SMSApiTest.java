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
import io.swagger.client.model.HLRError;
import io.swagger.client.model.OutOfCredit;
import io.swagger.client.model.SMSResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SMSApi
 */
@Ignore
public class SMSApiTest {

    private final SMSApi api = new SMSApi();

    
    /**
     * Send an SMS
     *
     * Send one or more SMS
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendSMSTest() throws ApiException {
        String key = null;
        List<String> num = null;
        String msg = null;
        String from = null;
        String deliverby = null;
        String dlrcb = null;
        String replycb = null;
        String replyemail = null;
        Integer validity = null;
        String cc = null;
        SMSResult response = api.sendSMS(key, num, msg, from, deliverby, dlrcb, replycb, replyemail, validity, cc);

        // TODO: test validations
    }
    
}
