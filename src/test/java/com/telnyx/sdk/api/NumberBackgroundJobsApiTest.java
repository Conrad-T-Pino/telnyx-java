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

import com.telnyx.sdk.*;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListPhoneNumbersBackgroundJobsResponse;
import com.telnyx.sdk.model.PhoneNumbersEnableEmergency;
import com.telnyx.sdk.model.PhoneNumbersJob;
import com.telnyx.sdk.model.PhoneNumbersJobDeletePhoneNumbers;
import com.telnyx.sdk.model.PhoneNumbersJobDeletePhoneNumbersRequest;
import com.telnyx.sdk.model.PhoneNumbersJobUpdateEmergencySettingsRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NumberBackgroundJobsApi
 */
public class NumberBackgroundJobsApiTest {

    private final NumberBackgroundJobsApi api = new NumberBackgroundJobsApi();

    /**
     * Delete a batch of numbers
     *
     * Creates a new background job to delete a batch of numbers. At most one thousand numbers can be updated per API call.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPhoneNumbersJobDeletePhoneNumbersTest() throws ApiException {
        //PhoneNumbersJobDeletePhoneNumbersRequest phoneNumbersJobDeletePhoneNumbersRequest = null;
        //PhoneNumbersJobDeletePhoneNumbers response = api.createPhoneNumbersJobDeletePhoneNumbers()
        //        .phoneNumbersJobDeletePhoneNumbersRequest(phoneNumbersJobDeletePhoneNumbersRequest)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update the emergency settings from a batch of numbers
     *
     * Creates a background job to update the emergency settings of a collection of phone numbers. At most one thousand numbers can be updated per API call.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPhoneNumbersJobUpdateEmergencySettingsTest() throws ApiException {
        //PhoneNumbersJobUpdateEmergencySettingsRequest phoneNumbersJobUpdateEmergencySettingsRequest = null;
        //PhoneNumbersEnableEmergency response = api.createPhoneNumbersJobUpdateEmergencySettings(phoneNumbersJobUpdateEmergencySettingsRequest);
        // TODO: test validations
    }

    /**
     * Lists the phone numbers jobs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPhoneNumbersJobsTest() throws ApiException {
        //String filterType = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String sort = null;
        //ListPhoneNumbersBackgroundJobsResponse response = api.listPhoneNumbersJobs()
        //        .filterType(filterType)
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .sort(sort)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a phone numbers job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrievePhoneNumbersJobTest() throws ApiException {
        //String id = null;
        //PhoneNumbersJob response = api.retrievePhoneNumbersJob(id)
        //        .execute();
        // TODO: test validations
    }

}
