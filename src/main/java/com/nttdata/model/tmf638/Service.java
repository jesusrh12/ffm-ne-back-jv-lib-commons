package com.nttdata.model.tmf638;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.nttdata.model.tmf.Characteristic;
import com.nttdata.model.tmf.Feature;
import com.nttdata.model.tmf.Note;
import com.nttdata.model.tmf.Party;
import com.nttdata.model.tmf.Place;
import com.nttdata.model.tmf.RelatedEntity;
import com.nttdata.model.tmf.ServiceOrderItem;
import com.nttdata.model.tmf.StartMode;

import lombok.Data;

@JsonTypeName("Service")
@Data
@JsonIgnoreProperties
public class Service {

	// protected Long id;
	protected String id;
	protected String href;
	protected String category;
	protected String description;
	protected Boolean hasStarted;
	protected Boolean isBundle;
	protected Boolean isServiceEnabled;
	protected Boolean isStateful;
	protected String name;
	protected String state;
	protected Date startDate;
	protected String serviceType;
	protected StartMode startMode;
	protected String type;

	protected List<Party> relatedto;
	protected List<Place> locatedin;
	protected java.util.List<ServiceSpecificationRef> definedby;
	protected java.util.List<ServiceOrderItem> serviceorderitems;
	protected List<Characteristic> characteristics;//Se requiere en el response
	protected List<Characteristic> serviceCharacteristic;//Se requiere en el request
	protected java.util.List<Service> composedof;
	protected String relationshipType;
	//protected String _atSchemaLocation;
	//protected String _atType;
	protected String _id;
	protected String __typename;
	protected String msg;

	// protected Date serviceDate;
	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
	protected Date serviceDate;
	protected Date endDate;
	@JsonProperty("@schemaLocation")
	protected String schemaLocation;
	@JsonProperty("@baseType")
	protected String baseType;
	@JsonProperty("@referredType")
	protected String referredType;

	protected List<Service> serviceRelationship;

	protected List<Service> serviceComposedOf;

	
	protected List<Feature> feature;
	protected List<Party> relatedParty;
	protected List<Note> note;
	protected List<ResourceRef> supportingResource;
	protected ServiceSpecificationRef serviceSpecification;
	protected List<RelatedEntity> relatedEntities;
	protected List<Place> place;
	protected List<Service> supportingService;
	protected String externalId;
	@JsonProperty("serviceState")
	protected String serviceState;
}
