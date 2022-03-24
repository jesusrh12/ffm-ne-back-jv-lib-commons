package com.nttdata.model.tmf;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ServiceOrder
 */
@JsonTypeName("ServiceOrder")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrder extends BaseNode {

    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("cancellationDate")
    private Date cancellationDate;

    @JsonProperty("cancellationReason")
    private String cancellationReason;

    @JsonProperty("category")
    private String category;

    @JsonProperty("completionDate")
    private Date completionDate;

    @JsonProperty("description")
    private String description;

    @JsonProperty("expectedCompletionDate")
    private Date expectedCompletionDate;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("notificationContact")
    private String notificationContact;

    @JsonProperty("orderDate")
    private Date orderDate;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("requestedCompletionDate")
    private Date requestedCompletionDate;

    @JsonProperty("requestedStartDate")
    private Date requestedStartDate;

    @JsonProperty("startDate")
    private Date startDate;

    @JsonProperty("externalReference")
    private List<ExternalReference> externalReference;

    @JsonProperty("note")
    private List<Note> note;

    @JsonProperty("orderRelationship")
    private List<ServiceOrderRelationship> orderRelationship;

    @JsonProperty("relatedParty")
    private List<Party> relatedParty;

    @JsonProperty("serviceOrderItem")
    private List<ServiceOrderItem> serviceOrderItem;

    @JsonProperty("cancelRequest")
    private CancellationRequest cancelRequest;

    @JsonProperty("modifyRequest")
    private List<ModificationRequest> modifyRequest;
    
    @JsonProperty("updateRequest")
    private List<UpdateResourceServiceOrder> updateRequest;

    @JsonProperty("state")
    private ServiceOrderStateType state;

    @JsonProperty("flowExecutionRef")
    private FlowExecutionRef flowExecutionRef;

}