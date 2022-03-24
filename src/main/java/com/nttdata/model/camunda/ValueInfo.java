package com.nttdata.model.camunda;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValueInfo {

    private String objectTypeName;
    private String serializationDataFormat;
    private String filename;
    private String mimetype;
    private String encoding;
    @JsonProperty("transient")
    private boolean _transient;
    private boolean local;
}
