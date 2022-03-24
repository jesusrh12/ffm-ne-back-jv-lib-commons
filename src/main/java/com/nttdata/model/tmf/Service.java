package com.nttdata.model.tmf;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

/**
 * Service is a base class for defining the Service hierarchy. All Services are characterized as either being possibly visible and usable by a Customer or not. This gives rise to the two subclasses of Service: CustomerFacingService and ResourceFacingService.
 */
@JsonTypeName("Service")
@Data
@JsonIgnoreProperties
public class Service {

    private Long id;
    // @Property("tagline") -> si en el mapper de salida tenemos otro nombre, éste se determina aqui
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


    private List<Service> serviceRelationship;

    private List<Service> serviceComposedOf;


    private List<Characteristic> serviceCharacteristic;
    private List<Feature> feature;
    private List<Party> relatedParty;
    private List<Note> note;
    private List<ResourceRef> supportingResource;
    private ServiceSpecificationRef serviceSpecification;
    private List<RelatedEntity> relatedEntities;
    private List<Place> place;
    private List<Service> supportingService;
    private String externalId;
    @JsonProperty("serviceState")
    private String serviceState;
}


