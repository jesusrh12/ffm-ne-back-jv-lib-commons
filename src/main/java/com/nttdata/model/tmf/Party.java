package com.nttdata.model.tmf;

import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import lombok.Data;

/**
 * Related Entity reference. A related party defines party or party role linked to a specific entity.
 */
@JsonTypeName("Party")
@Data
public class Party {

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("name")
    private String name;
    @JsonProperty("role")
    private String role;
    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;
    @JsonProperty("@baseType")
    private String _atBaseType;
    @JsonProperty("@type")
    private String _atType;
    @JsonProperty("@referredType")
    private String _atReferredType;
    private java.util.List<ServiceOrder> relatedto;
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
        	//filter: {id: {eq: "2"}}, 
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (href != null) {
            joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        //if (relatedto != null) {
        if (relatedto != null) {
            joiner.add("relatedto: " + GraphQLRequestSerializer.getEntry(relatedto));
        }
        
        return joiner.toString();
    }
}
