package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SymphonyData {
    private ImportFlowDraft importFlowDraft;

    @JsonCreator
    public SymphonyData(@JsonProperty("importFlowDraft") ImportFlowDraft importFlowDraft) {
        this.importFlowDraft = importFlowDraft;
    }
}
