/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telnyx.sdk.*;
import com.telnyx.sdk.auth.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertNotNull;


/**
 * API tests for AccessTokensApi
 */
public class AccessTokensApiTest {

    private final AccessTokensApi api = new AccessTokensApi();
    private ObjectMapper mapper;

    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);
//        defaultClient.setBasePath("https://api.telnyx.com/v2");
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);



        mapper = new JSON().getMapper();
    }
    /**
     * Create an Access Token.
     *
     * Create an Access Token (JWT) for the credential.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore
    public void createTelephonyCredentialTokenTest() throws ApiException {
        String id = "0e4726b9-7124-48f4-9012-4ed3780ad1c8";
        String response = api.createTelephonyCredentialToken(id);
        assertNotNull(response);
    }

}
