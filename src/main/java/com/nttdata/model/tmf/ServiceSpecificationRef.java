package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

@JsonTypeName("ServiceSpecification")

@Data
public class ServiceSpecificationRef {


    @JsonProperty("specId")
    private Long specId;
    @JsonProperty("id")
    private String id;
    public static final String JSON_PROPERTY_HREF = "href";
    private String href;
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;
    public static final String JSON_PROPERTY_VERSION = "version";
    private String version;
    public static final String JSON_PROPERTY_AT_SCHEMA_LOCATION = "@schemaLocation";
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    public static final String JSON_PROPERTY_AT_BASE_TYPE = "@baseType";
    @JsonProperty("@baseType")
    private String baseType;
    public static final String JSON_PROPERTY_AT_TYPE = "@type";
    @JsonProperty("@type")
    private String type;
    public static final String JSON_PROPERTY_AT_REFERRED_TYPE = "@referredType";
    @JsonProperty("@referredType")
    private String referredType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReferredType() {
        return referredType;
    }

    public void setReferredType(String referredType) {
        this.referredType = referredType;
    }




}
