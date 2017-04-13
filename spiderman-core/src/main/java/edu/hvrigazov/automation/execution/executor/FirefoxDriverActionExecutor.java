package edu.hvrigazov.automation.execution.executor;

import edu.hvrigazov.automation.execution.settings.ExecutionSettings;
import edu.hvrigazov.automation.execution.settings.FirefoxDriverExecutionSettings;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public class FirefoxDriverActionExecutor extends WebDriverActionExecutorBase {
    public FirefoxDriverActionExecutor(WebdriverActionExecutorBuilder webdriverActionExecutorBuilder) throws IOException, URISyntaxException {
        super(webdriverActionExecutorBuilder);
    }

    @Override
    protected ExecutionSettings createExecutionSettings() {
        return new FirefoxDriverExecutionSettings(this.baseURI, this::filterRequest, this::filterResponse);
    }

    @Override
    protected String getSystemProperty() {
        return "webdriver.gecko.driver";
    }
}