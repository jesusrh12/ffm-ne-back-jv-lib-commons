package com.nttdata.model.symphony;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ParamDefinition {

	private String key;
	private String type;
	private boolean mandatory;
	private boolean multipleValues;
	private List<String> choices;
	private String defaultValue;
	private String id;
	private String referent;
	private String expression;

	@JsonCreator
	public ParamDefinition() {
	}

	@JsonCreator
	public ParamDefinition(@JsonProperty("key") String key, @JsonProperty("type") String type,
			@JsonProperty("mandatory") boolean mandatory, @JsonProperty("multipleValues") boolean multipleValues,
			@JsonProperty("choices") List<String> choices, @JsonProperty("defaultValue") String defaultValue,
			@JsonProperty("id") String id) {
		this.key = key;
		this.type = type;
		this.mandatory = mandatory;
		this.multipleValues = multipleValues;
		this.choices = choices;
		this.defaultValue = defaultValue;
		this.id = id;
	}

	public ParamDefinition(String key, String type, boolean mandatory, boolean multipleValues, List<String> choices,
			String defaultValue, String id, String referent) {
		this.key = key;
		this.type = type;
		this.mandatory = mandatory;
		this.multipleValues = multipleValues;
		this.choices = choices;
		this.defaultValue = defaultValue;
		this.id = id;
		this.referent = referent;
	}

	public ParamDefinition(String key, String type, boolean mandatory, boolean multipleValues, List<String> choices,
			String defaultValue, String id, String referent, String expression) {
		this.expression = expression;
		this.key = key;
		this.type = type;
		this.mandatory = mandatory;
		this.multipleValues = multipleValues;
		this.choices = choices;
		this.defaultValue = defaultValue;
		this.id = id;
		this.referent = referent;
	}

	public ParamDefinition(String key, String defaultValue) {
		this.key = key;
		this.defaultValue = defaultValue;
	}
}
