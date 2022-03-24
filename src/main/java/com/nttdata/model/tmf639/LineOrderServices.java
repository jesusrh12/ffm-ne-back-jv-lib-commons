package com.nttdata.model.tmf639;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

/**
 * List of ordered services. To remove an existing service during a modification operation set an &#x60;&#x60;&#x60;ordered&#x60;&#x60;&#x60; field to &#x60;&#x60;&#x60;false&#x60;&#x60;&#x60; for the correspondent service. Example: &#x60;&#x60;&#x60;\&quot;bandwidth\&quot;: { \&quot;ordered\&quot; : false }&#x60;&#x60;&#x60;.
 */

@JsonTypeName("LineOrderServices")
public class LineOrderServices {

  private BandwidthServiceOrder bandwidth = null;


  public LineOrderServices bandwidth(BandwidthServiceOrder bandwidth) {
    
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/

  public BandwidthServiceOrder getBandwidth() {
    return bandwidth;
  }


  public void setBandwidth(BandwidthServiceOrder bandwidth) {
    this.bandwidth = bandwidth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineOrderServices lineOrderServices = (LineOrderServices) o;
    return Objects.equals(this.bandwidth, lineOrderServices.bandwidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineOrderServices {\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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

