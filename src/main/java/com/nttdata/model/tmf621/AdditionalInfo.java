package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdditionalInfo {
	@JsonProperty("dropWorkId")
	private String dropWorkId;
}
