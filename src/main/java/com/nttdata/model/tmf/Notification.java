package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Notification {

    @JsonProperty("personalizations")
    private List<Personalization> personalizations;

    @JsonProperty("from")
    private From from;

    @JsonProperty("reply_to")
    private ReplyTo reply_to;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("content")
    private List<Content> content;


}
