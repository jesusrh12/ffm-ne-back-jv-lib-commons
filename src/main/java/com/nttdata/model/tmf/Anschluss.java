package com.nttdata.model.tmf;

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
public class Anschluss {

    @JsonProperty("a10nsp")
    private String a10nsp;

    @JsonProperty("port")
    private String port;

    @JsonProperty("svlan")
    private String svlan;

    @JsonProperty("cvlan")
    private String cvlan;

    @JsonProperty("lineId")
    private String lineId;

    @JsonProperty("uebergabepunktKunde")
    private String uebergabepunktKunde;
}
