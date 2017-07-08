package com.hribol.bromium.core.utils.parsing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 08.07.17.
 */
public class StepsReader {

    public List<Map<String, String>> readSteps(String pathToSerializedTest) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(pathToSerializedTest);
        return readSteps(fileInputStream);
    }

    public List<Map<String, String>> readSteps(InputStream inputStream) throws IOException {
        String stepsRaw = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(stepsRaw, List.class);
    }
}
