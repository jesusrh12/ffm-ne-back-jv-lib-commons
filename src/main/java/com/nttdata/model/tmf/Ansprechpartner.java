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
public class Ansprechpartner {

    @JsonProperty("anrede")
    private String anrede;

    @JsonProperty("nachname")
    private String nachname;

    @JsonProperty("telefonnummer")
    private String telefonnummer;

    @JsonProperty("vorname")
    private String vorname;

    @JsonProperty("mobilfunknummer")
    private String mobilfunknummer;

    @JsonProperty("faxnummer")
    private String faxnummer;

    @JsonProperty("emailadresse")
    private String emailadresse;

    @JsonProperty("rolle")
    private String rolle;
}
