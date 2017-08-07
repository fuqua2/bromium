package com.hribol.bromium.integration.tests;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.TestScenarioSteps;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.UUID;

/**
 * Created by hvrigazov on 29.07.17.
 */
public class TestUtils {

    public static final String SCREEN_SYSTEM_PROPERTY = "screenNumber";
    public static final String DEMO_CONFIGURATION = "integration-tests/demo.json";
    public static final String DYNAMIC_TEST_CASE = "integration-tests/dynamic.json";
    public static final String AJAX_TEST_CASE = "integration-tests/ajax.json";
    public static final String RACE_HTTP_TEST_CASE = "integration-tests/race-http.json";
    public static final String TYPE_TEXT_TEST_CASE = "integration-tests/text-field.json";
    public static final String CHROMEDRIVER = "chromedriver";
    public static final String PAGE_LOAD_AJAX = "Load /ajax.html page";
    public static final String PAGE_LOAD_INDEX = "Load /index.html page";
    public static final String CLICK_LINK_TO_AJAX_DEMO_PAGE = "Click link to Ajax Demo page";

    public static final String AJAX_DEMO_ID = "ajax-demo";
    public static final String AJAX_DEMO_LINK = "ajax-demo-link";


    public static String generateRandomJsonFilename() {
        return UUID.randomUUID().toString() +".json";
    }

    public static TestScenarioSteps exampleTestScenarioSteps() {
        TestScenarioSteps steps = new TestScenarioSteps();
        steps.add(ImmutableMap.of(
                "event", "mockEvent1",
                "text", "mockText"));

        steps.add(ImmutableMap.of(
                "event", "mockEvent2",
                "text", "mockText"));

        steps.add(ImmutableMap.of(
                "event", "mockEvent1",
                "text", "mockText1"));

        return steps;
    }

    public static File extractResource(String resource, File testResourcesDirectory) throws IOException {
        File tempFile = File.createTempFile(resource, "", testResourcesDirectory);
        InputStream chromeDriverStream = TestUtils.class.getResourceAsStream("/" + resource);
        OutputStream fileOutputStream = new FileOutputStream(tempFile);
        IOUtils.copy(chromeDriverStream, fileOutputStream);
        chromeDriverStream.close();
        fileOutputStream.close();
        return tempFile;
    }
}
