package com.nttdata.model.tmf;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The notification data structure
 */
@ApiModel(description = "The notification data structure")
@JsonTypeName("Event")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Event extends BaseNode {

    @JsonProperty("event")
    private EventPayload eventPayload;

    @JsonProperty("eventId")
    private Long eventId;

    @JsonProperty("eventTime")
    private Date eventTime;

    @JsonProperty("eventType")
    private String eventType;

    @JsonProperty("correlationId")
    private String correlationId;

    @JsonProperty("domain")
    private String domain;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("timeOcurred")
    private Date timeOcurred;

    @Override
    public String toString() {
        return "class Event {\n" +
                "    eventId: " + toIndentedString(eventId) + "\n" +
                "    event: " + toIndentedString(eventPayload) + "\n" +
                "    eventTime: " + toIndentedString(eventTime) + "\n" +
                "    correlationId: " + toIndentedString(correlationId) + "\n" +
                "    domain: " + toIndentedString(domain) + "\n" +
                "    title: " + toIndentedString(title) + "\n" +
                "    description: " + toIndentedString(description) + "\n" +
                "    priority: " + toIndentedString(priority) + "\n" +
                "    timeOcurred: " + toIndentedString(timeOcurred) + "\n" +
                "    atBaseType: " + toIndentedString(_atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(_atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(_atType) + "\n" +
                "    atReferredType: " + toIndentedString(_atReferredType) + "\n" +
                "}";
    }

}