package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * A period of time, either as a deadline (endDateTime only) a startDateTime only, or both
 */
@ApiModel(description = "A period of time, either as a deadline (endDateTime only) a startDateTime only, or both")

@JsonTypeName("TimePeriod")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class TimePeriod extends BaseNode {

    @JsonProperty("endDateTime")
    private Date endDateTime;

    @JsonProperty("startDateTime")
    private Date startDateTime;

    @Override
    public String toString() {
        return "class TimePeriod {\n" +
                "    endDateTime: " + toIndentedString(endDateTime) + "\n" +
                "    startDateTime: " + toIndentedString(startDateTime) + "\n" +
                "    atBaseType: " + toIndentedString(_atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(_atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(_atType) + "\n" +
                "}";
    }

}