package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkTicket {
    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("creationDate")
    private String creationDate;

    @JsonProperty("description")
    private String description;

    @JsonProperty("expectedResolutionDate")
    private String expectedResolutionDate;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("lastUpdate")
    private String lastUpdate;

    @JsonProperty("name")
    private String name;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("requestedResolutionDate")
    private String requestedResolutionDate;

    @JsonProperty("resolutionDate")
    private String resolutionDate;

    @JsonProperty("severity")
    private String severity;

    @JsonProperty("statusChangeDate")
    private String statusChangeDate;

    @JsonProperty("statusChangeReason")
    private String statusChangeReason;

    @JsonProperty("ticketType")
    private String ticketType;

    @JsonProperty("attachment")
    private List<AttachmentRefOrValue> attachment;

    @JsonProperty("channel")
    private ChannelRef channel;

    @JsonProperty("characteristic")
    private List<Characteristic> characteristic;

    @JsonProperty("note")
    private List<Note> note;

    @JsonProperty("relatedEntity")
    private List<RelatedEntity> relatedEntity;

    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty;

    @JsonProperty("status")
    private WorkTicketStatusType status;

    @JsonProperty("statusChange")
    private List<StatusChange> statusChange;

    @JsonProperty("workTicketRelationship")
    private List<WorkTicketRelationship> workTicketRelationship;

    @JsonProperty("@baseType")
    private String _atBaseType;

    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;

    @JsonProperty("@type")
    private String _atType;
}
