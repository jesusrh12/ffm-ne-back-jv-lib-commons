package com.nttdata.model.tmf;


import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import lombok.Data;

/**
 * Place reference. Place defines the places where the products are sold or delivered.
 */
@JsonTypeName("Place")
@Data
public class Place {

    private String id;
    private String href;
    private String name;
    private String role;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("@referredType")
    private String referredType;
    
    
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        if (schemaLocation != null) {
            joiner.add("schemaLocation: " + GraphQLRequestSerializer.getEntry(schemaLocation));
        }
        if (baseType != null) {
            joiner.add("baseType: " + GraphQLRequestSerializer.getEntry(baseType));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
       /* if (referredType != null) {
            joiner.add("_atType: " + GraphQLRequestSerializer.getEntry(referredType));
        }
        */
        return joiner.toString();
    }
}

