package com.invest.honduras.util;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.codec.binary.Base64;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {

    public static Boolean isTrue(Boolean value) {
        return value;
    }

    /**
     * Generate a random UUID
     */ 
    public static String generateRandomUuid() {
        return UUID.randomUUID().toString();
    }

    public static String decodeToken(String token) {
        // TODO Auto-generated method stub
        
        String value = "";
        try {
            String[] jwtTokenValues;
            JSONObject jsonClaim = new JSONObject();
            final Base64 base64Url = new Base64(true);
           // String sub = "";
            jwtTokenValues = token.split("\\.");

            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Object> mapper = new HashMap<String, Object>();

            if (jwtTokenValues.length > 1) {
                value = new String(base64Url.decode(jwtTokenValues[1].getBytes()));
                JSONParser parser = new JSONParser();
                mapper = objectMapper.readValue(value, new TypeReference<HashMap<String, Object>>() {
                });
                
                boolean subKey = mapper.containsKey("sub");
                jsonClaim = (JSONObject) parser.parse(value);
                value = "";
                //JSONObject jsonResponse = new JSONObject();
                if (subKey) {                    
                	value = (String) jsonClaim.get("sub");
                }

            }
            
        } catch (Exception e) {            
            return "Error" + e ;
        }
        return value;

    }   
    

    
    public static boolean match(String text , String regex) {
    	 	String patternString = regex;
    	 
    	 Pattern pattern = Pattern.compile(patternString);

         Matcher matcher = pattern.matcher(text);
         boolean matches = matcher.matches();
    	return matches;
    }    

    
}
