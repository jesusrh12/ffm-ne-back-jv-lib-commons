package com.nttdata.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nttdata.model.symphony.ParamDefinition;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utils {

    /**
     * Catalog driver validate parameters
     * @param paramValid
     * @param paramDefinitions
     * @return
     */
    public static boolean validatedParameters(List<String> paramValid, List<ParamDefinition> paramDefinitions) {
        boolean correct  = true;
        ObjectMapper objectMapper = new ObjectMapper();
        JSONObject json1 = null;
        String json2 = "";
        JSONParser parser = new JSONParser();
        try {
            HashMap<String, ParamDefinition> map = paramDefinitions.stream().collect(Collectors
                    .toMap(ParamDefinition::getKey, paramDefinition -> paramDefinition, (v, k) -> k, HashMap::new));
            json2 = objectMapper.writeValueAsString(map);
            json1 = (JSONObject) parser.parse(json2);
            for (String paramToValid: paramValid) {
                if (json1.get(paramToValid) == null){
                    correct = false;
                    break;
                }
            }
        }catch (JsonProcessingException | ParseException e) {
            e.printStackTrace();

        }
        return correct;
    }
}
