package com.taunt;



import org.jsoup.Connection;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


import java.io.IOException;
import java.util.Map;


public class ContentUtils {

    public static String getContent() {
        RestTemplate restTemplate = new RestTemplate();
        try {
            ResponseEntity<Map> entity = restTemplate.getForEntity("https://collect.xmwxxc.com/collect/djt/?type=0", Map.class);
            HttpStatus statusCode = entity.getStatusCode();
            if(statusCode.is2xxSuccessful()){
                Map body = entity.getBody();
                Map data = (Map) body.get("data");
                if (data != null) {
                    String message = (String) data.get("message");
                    return message;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
