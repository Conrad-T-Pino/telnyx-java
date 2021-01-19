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
import com.telnyx.sdk.model.*;
import org.junit.*;


import java.math.BigDecimal;
import java.util.UUID;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * API tests for OutboundVoiceProfilesApi
 */
public class OutboundVoiceProfilesApiTest {

    private final OutboundVoiceProfilesApi api = new OutboundVoiceProfilesApi();
    private OutboundVoiceProfile existingOutboundVoiceProfile;

    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);

        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);

        try {
            CreateOutboundVoiceProfileRequest createOutboundVoiceProfileRequest = new CreateOutboundVoiceProfileRequest().name("test-name-" + System.currentTimeMillis());
            existingOutboundVoiceProfile = api.createOutboundVoiceProfile(createOutboundVoiceProfileRequest).getData();
        } catch (Exception e) {
            fail("Test Setup Failure - Unable to create outbound voice profile: " + e.getMessage());
        }
    }

    @After
    public void tearDown() {
        try {
            api.deleteOutboundVoiceProfile(existingOutboundVoiceProfile.getId());
        } catch (ApiException e) {
            //ignore
        }
    }

    /**
     * Create an outbound voice profile
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOutboundVoiceProfile_whenRequestIsValid_returnsCreatedOutboundVoiceProfile() throws ApiException {
        OutboundCallRecording outboundCallRecording = new OutboundCallRecording()
                .callRecordingCallerPhoneNumbers(asList("+19705555098"))
                .callRecordingChannels(OutboundCallRecording.CallRecordingChannelsEnum.DUAL)
                .callRecordingFormat(OutboundCallRecording.CallRecordingFormatEnum.MP3)
                .callRecordingType(OutboundCallRecording.CallRecordingTypeEnum.BY_CALLER_PHONE_NUMBER);

        CreateOutboundVoiceProfileRequest createOutboundVoiceProfileRequest = new CreateOutboundVoiceProfileRequest()
                .billingGroupId(null)
                .callRecording(outboundCallRecording)
                .concurrentCallLimit(10)
                .dailySpendLimit("100.00")
                .dailySpendLimitEnabled(true)
                .enabled(true)
                .maxDestinationRate(BigDecimal.TEN)
                .name("office-" + System.currentTimeMillis())
                .servicePlan(ServicePlan.US)
                .tags(asList("office-profile"))
                .trafficType(TrafficType.SHORT_DURATION)
                .usagePaymentMethod(UsagePaymentMethod.TARIFF)
                .whitelistedDestinations(asList("US"));

        OutboundVoiceProfileResponse actualOutboundVoiceProfileResponse = api.createOutboundVoiceProfile(createOutboundVoiceProfileRequest);
        String actualId = actualOutboundVoiceProfileResponse.getData().getId();

        assertNotNull(actualId);

        //Clean-up
        try {
            api.deleteOutboundVoiceProfile(actualId);
        } catch (ApiException e) {
            // ignore
        }
    }

    /**
     * Delete an outbound voice profile
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOutboundVoiceProfile_whenValidId_returnsDeletedOutboundVoiceProfile() throws ApiException {
        String actualOutboundVoiceProfileId = api.deleteOutboundVoiceProfile(existingOutboundVoiceProfile.getId())
                .getData()
                .getId();

        assertEquals(existingOutboundVoiceProfile.getId(), actualOutboundVoiceProfileId);
    }

    /**
     * Retrieve an outbound voice profile
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveOutboundVoiceProfile_whenProfileExists_returnsProfile() throws ApiException {
        OutboundVoiceProfile actualOutboundVoiceProfile = api.retrieveOutboundVoiceProfile(existingOutboundVoiceProfile.getId()).getData();

        assertEquals(existingOutboundVoiceProfile.getId(), actualOutboundVoiceProfile.getId());
    }

    /**
     * List outbound voice profiles
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore("Mock returns error message when passing sort and filterNameContains, however this works as expected in production. Ignore until mock is fixed.")
    public void listOutboundVoiceProfiles_whenOutboundVoiceProfilesExists_returnsOutboundVoiceProfiles() throws ApiException {
        ListOutboundVoiceProfilesResponse listOutboundVoiceProfilesResponse = api.listOutboundVoiceProfiles()
                .pageNumber(1)
                .pageSize(20)
                .sort("name")
                .filterNameContains("test")
                .execute();

        assertNotNull(listOutboundVoiceProfilesResponse);
    }

    /**
     * Updates an existing outbound voice profile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore("Once mock is fixed, replace billing group ID with a value that will work for both mock and production")
    public void updateOutboundVoiceProfile_whenRequestIsValid_returnsUpdatedOutboundVoiceProfile() throws ApiException {
        OutboundCallRecording outboundCallRecording = new OutboundCallRecording()
                .callRecordingCallerPhoneNumbers(asList("+15555551234"))
                .callRecordingChannels(OutboundCallRecording.CallRecordingChannelsEnum.SINGLE)
                .callRecordingFormat(OutboundCallRecording.CallRecordingFormatEnum.WAV)
                .callRecordingType(OutboundCallRecording.CallRecordingTypeEnum.NONE);

        UpdateOutboundVoiceProfileRequest outboundVoiceProfileRequest = new UpdateOutboundVoiceProfileRequest()
                .billingGroupId(UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"))
                .callRecording(outboundCallRecording)
                .concurrentCallLimit(5)
                .dailySpendLimit("200.00")
                .dailySpendLimitEnabled(false)
                .enabled(false)
                .maxDestinationRate(BigDecimal.valueOf(1.0D))
                .name("update-test-name")
                .tags(asList("update-test-tag"))
                .trafficType(TrafficType.CONVERSATIONAL)
                .usagePaymentMethod(UsagePaymentMethod.RATE_DECK)
                .whitelistedDestinations(asList("US"));

        OutboundVoiceProfile actualOutboundVoiceProfile = api.updateOutboundVoiceProfile(existingOutboundVoiceProfile.getId(), outboundVoiceProfileRequest).getData();

        assertEquals(outboundVoiceProfileRequest.getBillingGroupId(), actualOutboundVoiceProfile.getBillingGroupId());
        assertEquals(outboundVoiceProfileRequest.getCallRecording(), actualOutboundVoiceProfile.getCallRecording());
        assertEquals(outboundVoiceProfileRequest.getConcurrentCallLimit(), actualOutboundVoiceProfile.getConcurrentCallLimit());
        assertEquals(outboundVoiceProfileRequest.getDailySpendLimit(), actualOutboundVoiceProfile.getDailySpendLimit());
        assertEquals(outboundVoiceProfileRequest.getDailySpendLimitEnabled(), actualOutboundVoiceProfile.getDailySpendLimitEnabled());
        assertEquals(outboundVoiceProfileRequest.getEnabled(), actualOutboundVoiceProfile.getEnabled());
        assertEquals(0, outboundVoiceProfileRequest.getMaxDestinationRate().compareTo(actualOutboundVoiceProfile.getMaxDestinationRate()));
        assertEquals(outboundVoiceProfileRequest.getName(), actualOutboundVoiceProfile.getName());
        assertEquals(outboundVoiceProfileRequest.getTags(), actualOutboundVoiceProfile.getTags());
        assertEquals(outboundVoiceProfileRequest.getTrafficType(), actualOutboundVoiceProfile.getTrafficType());
        assertEquals(outboundVoiceProfileRequest.getUsagePaymentMethod(), actualOutboundVoiceProfile.getUsagePaymentMethod());
        assertEquals(outboundVoiceProfileRequest.getWhitelistedDestinations(), actualOutboundVoiceProfile.getWhitelistedDestinations());
    }

    /**
     * Updates concurrent call limit to null on an existing outbound voice profile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore("Mock doesn't allow null value, but production api does. This test exists to ensure the sdk allows null values to be sent. Ignore until mock is fixed.")
    public void updateOutboundVoiceProfile_whenConcurrentCallLimitNull_returnsUpdatedOutboundVoiceProfile() throws ApiException {
        UpdateOutboundVoiceProfileRequest setInitialConcurrentCallLimit = new UpdateOutboundVoiceProfileRequest()
                .name("test-concurrent-limit-null")
                .concurrentCallLimit(5);
        existingOutboundVoiceProfile = api.updateOutboundVoiceProfile(existingOutboundVoiceProfile.getId(), setInitialConcurrentCallLimit).getData();

        UpdateOutboundVoiceProfileRequest outboundVoiceProfileRequest = new UpdateOutboundVoiceProfileRequest()
                .name("test-concurrent-limit-null")
                .concurrentCallLimit(null);
        OutboundVoiceProfile actualOutboundVoiceProfile = api.updateOutboundVoiceProfile(existingOutboundVoiceProfile.getId(), outboundVoiceProfileRequest).getData();

        assertNull(actualOutboundVoiceProfile.getConcurrentCallLimit());
    }

}
