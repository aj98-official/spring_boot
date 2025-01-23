package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "my")
public class ApplicationPropertyConfig {

    private Map<String, String> myMap = new HashMap<>();

    @Value("${MY_SECRET_MAP:#{null}}")
    private String mySecretMapJson;

    @PostConstruct
    public void init() throws IOException {
        if (mySecretMapJson != null) {
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, String> secretMap = objectMapper.readValue(mySecretMapJson, HashMap.class);
            myMap.putAll(secretMap);
        }
    }

    public Map<String, String> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }
}