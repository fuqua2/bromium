package com.hribol.spiderman.cli.handlers;

import com.hribol.spiderman.cli.commands.PromptUtils;
import com.hribol.spiderman.cli.commands.RecordCommand;
import com.hribol.spiderman.cli.commands.ReplayCommand;
import com.hribol.spiderman.cli.factory.ExecutionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 09.05.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ReplayCommandHandler.class,
        ReplayCommand.class,
        PromptUtils.class,
        ReplayCommand.Builder.class
})
public class ReplayCommandHandlerTest {
    @Test
    public void replayCommandHandlerIsRan() throws Exception {
        /**
         *
         String pathToDriver = getPathToDriver(opts);
         String pathToApplicationConfiguration = getPathToApplicationConfiguration(opts);
         String pathToSerializedTest = getPathToTestCase(opts);
         String csvMeasurementsFileName = getMeasurementsFile(opts);
         int timeout = getTimeout(opts);
         int measurementsPrecisionMilli = getMeasurementsPrecisionMilli(opts);
         String baseURL = getBaseUrl(opts);
         String browserType = getBrowserType(opts);
         */

        Map<String, Object> opts = new HashMap<>();

        String pathToDriver = "chromedriver";
        String configuration = "configuration.json";
        String testCase = "case.json";
        String measurements = "measurements.csv";
        String precision = "500";
        String browserType = CHROME;
        String timeout = "10";
        String url = "http://tenniskafe.com";

        opts.put(OptUtils.DRIVER, pathToDriver);
        opts.put(OptUtils.APPLICATION, configuration);
        opts.put(OptUtils.CASE, testCase);
        opts.put(OptUtils.MEASUREMENTS, measurements);
        opts.put(OptUtils.PRECISION, precision);
        opts.put(OptUtils.BROWSER, browserType);
        opts.put(OptUtils.TIMEOUT, timeout);
        opts.put(OptUtils.URL, url);

        CommandHandler commandHandler = new ReplayCommandHandler();

        ReplayCommand command = mock(ReplayCommand.class);

        ReplayCommand.Builder builder = mock(ReplayCommand.Builder.class);
        when(builder.pathToDriver(pathToDriver)).thenReturn(builder);
        when(builder.applicationConfiguration(configuration)).thenReturn(builder);
        when(builder.testCase(testCase)).thenReturn(builder);
        when(builder.timeout(10)).thenReturn(builder);
        when(builder.measurementsPrecisionMilli(500)).thenReturn(builder);
        when(builder.baseURL(url)).thenReturn(builder);
        when(builder.browserType(browserType)).thenReturn(builder);
        when(builder.executionFactory(any(ExecutionFactory.class))).thenReturn(builder);
        when(builder.build()).thenReturn(command);

        whenNew(ReplayCommand.Builder.class).withAnyArguments().thenReturn(builder);

        commandHandler.handle(opts);

        verify(command).run();
    }
}