package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ContentInfo {

	/**
	 * Común
	 */
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("externalID")
	private String externalID;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("internalID")
	private String internalID;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("meldungscode")
	private String meldungscode;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("meldungstext")
	private String meldungstext;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("wiedervorlagetermin")
	private String wiedervorlagetermin;

	/**
	 * Confirmation message
	 */
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("datum")
	private String datum;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("zeitfenster")
	private String zeitfenster;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("anschluss")
	private Anschluss anschluss;

	/**
	 * Ready for service/cancellation message
	 */
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("erledigungstermin")
	private String erledigungstermin;

	/**
	 * Delay message
	 */
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("verzoegerungstermin")
	private String verzoegerungstermin;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("verzogerungsgrund")
	private String verzogerungsgrund;

	/**
	 * Information message
	 */
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("nachricht")
	private String nachricht;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("ansprechpartner")
	private Ansprechpartner ansprechpartner;
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("seriennummerONT")
	private String seriennummerONT;

}
