package com.nttdata.model.tmf639;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * Internet bandwidth service order
 */

@JsonTypeName("BandwidthServiceOrder")
public class BandwidthServiceOrder {

  private Boolean ordered = true;
  private Integer upstreamBandwidth;
  private Integer downstreamBandwidth;


  public BandwidthServiceOrder ordered(Boolean ordered) {
    
    this.ordered = ordered;
    return this;
  }

   /**
   * Value &#39;false&#39; is used to remove the service during a modification operation.
   * @return ordered
  **/

  public Boolean getOrdered() {
    return ordered;
  }

  public void setOrdered(Boolean ordered) {
    this.ordered = ordered;
  }


  public BandwidthServiceOrder upstreamBandwidth(Integer upstreamBandwidth) {
    
    this.upstreamBandwidth = upstreamBandwidth;
    return this;
  }

   /**
   * Requested upstream bandwidth in kbps. Required if orderType &#x3D; BSA.
   * @return upstreamBandwidth
  **/


  public Integer getUpstreamBandwidth() {
    return upstreamBandwidth;
  }


  public void setUpstreamBandwidth(Integer upstreamBandwidth) {
    this.upstreamBandwidth = upstreamBandwidth;
  }


  public BandwidthServiceOrder downstreamBandwidth(Integer downstreamBandwidth) {
    
    this.downstreamBandwidth = downstreamBandwidth;
    return this;
  }

   /**
   * Requested downstream bandwidth in kbps. Required if ordertype &#x3D; BSA.
   * @return downstreamBandwidth
  **/

  public Integer getDownstreamBandwidth() {
    return downstreamBandwidth;
  }


  public void setDownstreamBandwidth(Integer downstreamBandwidth) {
    this.downstreamBandwidth = downstreamBandwidth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BandwidthServiceOrder bandwidthServiceOrder = (BandwidthServiceOrder) o;
    return Objects.equals(this.ordered, bandwidthServiceOrder.ordered) &&
        Objects.equals(this.upstreamBandwidth, bandwidthServiceOrder.upstreamBandwidth) &&
        Objects.equals(this.downstreamBandwidth, bandwidthServiceOrder.downstreamBandwidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ordered, upstreamBandwidth, downstreamBandwidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BandwidthServiceOrder {\n");
    sb.append("    ordered: ").append(toIndentedString(ordered)).append("\n");
    sb.append("    upstreamBandwidth: ").append(toIndentedString(upstreamBandwidth)).append("\n");
    sb.append("    downstreamBandwidth: ").append(toIndentedString(downstreamBandwidth)).append("\n");
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

