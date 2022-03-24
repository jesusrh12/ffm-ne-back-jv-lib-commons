package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FlowInstanceRef {
    private Long id;
    private String href;
    private String name;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@type")
    private String type;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getschemaLocation() {
        return schemaLocation;
    }

    public void setschemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public String getbaseType() {
        return baseType;
    }

    public void setbaseType(String baseType) {
        this.baseType = baseType;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Feature {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    atBaseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    atSchemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    atType: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
