package com.hribol.bromium.common.record.application;

import com.hribol.bromium.common.record.generation.IncludeInvokeGenerator;
import com.hribol.bromium.common.record.generation.NameWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.common.record.RecorderTypeRegistry;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class IncludeInvokeRecorderGeneratorTest {

    @Test
    public void registersActionAfterCodeIsGenerated() {
        String eventName = "eventName";
        String functionCode = "function something(a) {}", invocationCode = "something(#a'";

        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        RecorderTypeRegistry recordingTypeRegistry = mock(RecorderTypeRegistry.class);
        when(recordingTypeRegistry.getCodeForType(eventName, webDriverActionConfiguration))
                .thenReturn(functionCode, invocationCode);

        JavascriptGenerator<NameWebDriverActionConfiguration> webDriverActionGenerator = new IncludeInvokeGenerator(recordingTypeRegistry);

        String actual = webDriverActionGenerator.generate(
                new NameWebDriverActionConfiguration(eventName, webDriverActionConfiguration));

        assertEquals(functionCode, actual);
        verify(recordingTypeRegistry).register(eventName, webDriverActionConfiguration);
    }

}
