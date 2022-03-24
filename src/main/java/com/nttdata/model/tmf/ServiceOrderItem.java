package com.nttdata.model.tmf;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.nttdata.model.tmf638.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * ServiceOrderItem
 */
@JsonTypeName("ServiceOrderItem")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ServiceOrderItem extends BaseNode {


    private Long serviceOrderItemId;

    @JsonProperty("id")
    private String id;

    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("action")
    private OrderItemActionType action;

    @JsonProperty("appointment")
    private AppointmentRef appointment;

    @JsonProperty("service")
    private Service service;

    @JsonProperty("serviceOrderItem")
    private List<ServiceOrderItem> item;

    @JsonProperty("serviceOrderItemRelationship")
    private List<ServiceOrderItemRelationship> serviceOrderItemRelationship;

    @JsonProperty("state")
    private ServiceOrderItemStateType state;

    @JsonProperty("flowInstanceRef")
    private FlowInstanceRef flowInstanceRef;


}