package com.nttdata.model.tmf639;


import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

/**
 * Resources assigned to line and services
 */

@JsonTypeName("LineResources")
public class LineResources {

  private LineResourcesOdf odf;
  private LineResourcesOlt olt;
  private LineResourcesBroadband broadband;


  public LineResources odf(LineResourcesOdf odf) {
    
    this.odf = odf;
    return this;
  }

   /**
   * Get odf
   * @return odf
  **/

  public LineResourcesOdf getOdf() {
    return odf;
  }

  public void setOdf(LineResourcesOdf odf) {
    this.odf = odf;
  }


  public LineResources olt(LineResourcesOlt olt) {
    
    this.olt = olt;
    return this;
  }

   /**
   * Get olt
   * @return olt
  **/

  public LineResourcesOlt getOlt() {
    return olt;
  }


  public void setOlt(LineResourcesOlt olt) {
    this.olt = olt;
  }


  public LineResources broadband(LineResourcesBroadband broadband) {
    
    this.broadband = broadband;
    return this;
  }

   /**
   * Get broadband
   * @return broadband
  **/

  public LineResourcesBroadband getBroadband() {
    return broadband;
  }


  public void setBroadband(LineResourcesBroadband broadband) {
    this.broadband = broadband;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineResources lineResources = (LineResources) o;
    return Objects.equals(this.odf, lineResources.odf) &&
        Objects.equals(this.olt, lineResources.olt) &&
        Objects.equals(this.broadband, lineResources.broadband);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odf, olt, broadband);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineResources {\n");
    sb.append("    odf: ").append(toIndentedString(odf)).append("\n");
    sb.append("    olt: ").append(toIndentedString(olt)).append("\n");
    sb.append("    broadband: ").append(toIndentedString(broadband)).append("\n");
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

