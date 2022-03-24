package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ImportFlowDraft {

    private String id;
    private String name;
    private String description;
    private List<Block> blocks;
    private List<Connector> connectors;

    @JsonCreator
    public ImportFlowDraft(@JsonProperty("id") String id,
                           @JsonProperty("name") String name,
                           @JsonProperty("description") String description,
                           @JsonProperty("blocks") List<Block> blocks,
                           @JsonProperty("connectors") List<Connector> connectors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.blocks = blocks;
        this.connectors = connectors;

    }
}
