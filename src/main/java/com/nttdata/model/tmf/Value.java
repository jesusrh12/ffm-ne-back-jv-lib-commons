package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Value {

    private Long id;
    @JsonProperty("@vCPE_IP")
    private String vCPEIP;
    @JsonProperty("@MaxTxRate")
    private Long maxTxRate;
    @JsonProperty("@TransmitPower")
    private String transmitPower;
    private String maxTream;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@type")
    private String type;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getvCPEIP() {
        return vCPEIP;
    }

    public void setvCPEIP(String vCPEIP) {
        this.vCPEIP = vCPEIP;
    }

    public Long getMaxTxRate() {
        return maxTxRate;
    }

    public void setMaxTxRate(Long maxTxRate) {
        this.maxTxRate = maxTxRate;
    }

    public String getTransmitPower() {
        return transmitPower;
    }

    public void setTransmitPower(String transmitPower) {
        this.transmitPower = transmitPower;
    }

    public String getMaxTream() {
        return maxTream;
    }

    public void setMaxTream(String maxTream) {
        this.maxTream = maxTream;
    }

    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceSpecificationRef {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vCPEIP: ").append(toIndentedString(vCPEIP)).append("\n");
        sb.append("    maxTxRate: ").append(toIndentedString(maxTxRate)).append("\n");
        sb.append("    transmitPower: ").append(toIndentedString(transmitPower)).append("\n");
        sb.append("    maxTream: ").append(toIndentedString(maxTream)).append("\n");
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
