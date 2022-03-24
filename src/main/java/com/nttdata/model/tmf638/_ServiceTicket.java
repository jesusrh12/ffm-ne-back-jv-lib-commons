package com.nttdata.model.tmf638;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nttdata.model.tmf.Characteristic;
import com.nttdata.model.tmf.Feature;
import com.nttdata.model.tmf.Note;
import com.nttdata.model.tmf.Party;
import com.nttdata.model.tmf.Place;
import com.nttdata.model.tmf.RelatedEntity;
import com.nttdata.model.tmf.StartMode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class _ServiceTicket {

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
