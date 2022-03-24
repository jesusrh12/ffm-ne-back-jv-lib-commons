package com.nttdata.model.tmf638;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nttdata.model.tmf.BaseNode;
import com.nttdata.model.tmf.StartMode;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ServiceRefOrValue extends BaseNode{
	
	private Long id;
    private String href;
    private String category;
    private String description;
    private boolean hasStarted;
    private boolean isBundle;
    private boolean isServiceEnabled;
    private boolean isStateful;
    private String name;
    private String state;
    private Date startDate;
    private String serviceType;
    private StartMode startMode;
    private String type;
    private Date serviceDate;
    private Date endDate;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@referredType")
    private String referredType;
	
}


