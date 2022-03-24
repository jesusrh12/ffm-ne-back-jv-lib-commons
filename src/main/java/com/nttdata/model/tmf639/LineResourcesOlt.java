package com.nttdata.model.tmf639;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

/**
 * Network resources associated with this line.
 */

@JsonTypeName("LineResources_olt")
public class LineResourcesOlt {

  private String region;
  private String lacId;
  private String oltId;
  private LineResourcesOltOltPort oltPort;
  private Integer ontId;
  private String ontPassword;


  public LineResourcesOlt region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * BNG region: 1-5
   * @return region
  **/

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public LineResourcesOlt lacId(String lacId) {
    
    this.lacId = lacId;
    return this;
  }

   /**
   * LAC identifier: &#x60;&#x60;&#x60; Central:  A, B, C, D, E East:     F, G, H, I, J South:    K, L M, N, O North:    P, Q, R, S T West:     U, V, W, X, Y &#x60;&#x60;&#x60; 
   * @return lacId
  **/


  public String getLacId() {
    return lacId;
  }


  public void setLacId(String lacId) {
    this.lacId = lacId;
  }


  public LineResourcesOlt oltId(String oltId) {
    
    this.oltId = oltId;
    return this;
  }

   /**
   * OLT identifier
   * @return oltId
  **/

  public String getOltId() {
    return oltId;
  }


  public void setOltId(String oltId) {
    this.oltId = oltId;
  }


  public LineResourcesOlt oltPort(LineResourcesOltOltPort oltPort) {
    
    this.oltPort = oltPort;
    return this;
  }

   /**
   * Get oltPort
   * @return oltPort
  **/

  public LineResourcesOltOltPort getOltPort() {
    return oltPort;
  }


  public void setOltPort(LineResourcesOltOltPort oltPort) {
    this.oltPort = oltPort;
  }


  public LineResourcesOlt ontId(Integer ontId) {
    
    this.ontId = ontId;
    return this;
  }

   /**
   * Customer&#39;s ONT unique identifier within the OLT Port
   * minimum: 0
   * maximum: 255
   * @return ontId
  **/
  public Integer getOntId() {
    return ontId;
  }


  public void setOntId(Integer ontId) {
    this.ontId = ontId;
  }


  public LineResourcesOlt ontPassword(String ontPassword) {
    
    this.ontPassword = ontPassword;
    return this;
  }

   /**
   * Customer&#39;s ONT authentication password. Unique per OLT.
   * @return ontPassword
  **/
  public String getOntPassword() {
    return ontPassword;
  }


  public void setOntPassword(String ontPassword) {
    this.ontPassword = ontPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineResourcesOlt lineResourcesOlt = (LineResourcesOlt) o;
    return Objects.equals(this.region, lineResourcesOlt.region) &&
        Objects.equals(this.lacId, lineResourcesOlt.lacId) &&
        Objects.equals(this.oltId, lineResourcesOlt.oltId) &&
        Objects.equals(this.oltPort, lineResourcesOlt.oltPort) &&
        Objects.equals(this.ontId, lineResourcesOlt.ontId) &&
        Objects.equals(this.ontPassword, lineResourcesOlt.ontPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, lacId, oltId, oltPort, ontId, ontPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineResourcesOlt {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    lacId: ").append(toIndentedString(lacId)).append("\n");
    sb.append("    oltId: ").append(toIndentedString(oltId)).append("\n");
    sb.append("    oltPort: ").append(toIndentedString(oltPort)).append("\n");
    sb.append("    ontId: ").append(toIndentedString(ontId)).append("\n");
    sb.append("    ontPassword: ").append(toIndentedString(ontPassword)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

