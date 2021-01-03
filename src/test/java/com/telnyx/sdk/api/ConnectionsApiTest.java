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

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.HttpBearerAuth;
import com.telnyx.sdk.model.ConnectionResponse;
import com.telnyx.sdk.model.ListConnectionsResponse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * API tests for ConnectionsApi
 */
public class ConnectionsApiTest {

    private final ConnectionsApi api = new ConnectionsApi();

    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);

        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);

    }

    /**
     * List connections
     * <p>
     * Returns a list of your connections irrespective of type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listConnections_defaultParams_returnsNotNullListOfConnections() throws ApiException {
        //given
        Integer pageNumber = 1;
        Integer pageSize = 20;
        String filterConnectionNameContains = "";
        String filterOutboundVoiceProfileId = "123";
        String sort = "created_at";

        //when
        ListConnectionsResponse response = api.listConnections()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterConnectionNameContains(filterConnectionNameContains)
                .filterOutboundVoiceProfileId(filterOutboundVoiceProfileId)
                .sort(sort)
                .execute();


        //then
        assertNotNull(response);
    }

    /**
     * Retrieve a connection
     * <p>
     * Retrieves the high-level details of an existing connection. To retrieve specific authentication information, use the endpoint for the specific connection type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveConnection_connectionIdProvided_returnsConnection() throws ApiException {
        ConnectionResponse response = api.retrieveConnection(TestConfiguration.EXISTING_CONNECTION_ID);
        assertNotNull(response);
    }
}
