package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.TEXT;
import static org.junit.Assert.assertNotNull;

/**
 * Created by hvrigazov on 13.05.17.
 */
public class TypeTextInElementFoundByCssSelectorParserTest {

    @Test
    public void parsesCorrectlyMap() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put(CSS_SELECTOR, ".something");
        parameters.put(EVENT, "EVENT");
        parameters.put(TEXT, "something");

        boolean expectHttp = true;

        WebDriverActionParameterParser parser = new TypeTextInElementFoundByCssSelectorParser();
        WebDriverAction webDriverAction = parser.create(parameters, expectHttp);

        assertNotNull(webDriverAction);
    }
}
