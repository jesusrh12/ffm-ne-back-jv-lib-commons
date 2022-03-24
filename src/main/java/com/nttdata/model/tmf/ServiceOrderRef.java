package com.nttdata.model.tmf;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Service Order reference. Useful to understand the which was the Service order through which the service was
 * instantiated in the service inventory
 */
@ApiModel(description = "Service Order reference. Useful to understand the which was the Service order through" +
        "which the service was instantiated in the service inventory")
@JsonTypeName("ServiceOrderRef")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrderRef extends BaseNode {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("href")
    private URI href;

    @JsonProperty("name")
    private String name;


}