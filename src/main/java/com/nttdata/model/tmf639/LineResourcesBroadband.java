package com.nttdata.model.tmf639;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

/**
 * Broadband service data
 */

@JsonTypeName("LineResources_broadband")
public class LineResourcesBroadband {


  private Integer sVlan;
  private Integer cVlan;
  private Integer uVlan;


  public LineResourcesBroadband sVlan(Integer sVlan) {
    
    this.sVlan = sVlan;
    return this;
  }

   /**
   * S-VLAN of the line&#39;s circuit
   * minimum: 0
   * maximum: 4095
   * @return sVlan
  **/


  public Integer getsVlan() {
    return sVlan;
  }


  public void setsVlan(Integer sVlan) {
    this.sVlan = sVlan;
  }


  public LineResourcesBroadband cVlan(Integer cVlan) {
    
    this.cVlan = cVlan;
    return this;
  }

   /**
   * C-VLAN of the line&#39;s circuit
   * minimum: 0
   * maximum: 4095
   * @return cVlan
  **/
  public Integer getcVlan() {
    return cVlan;
  }


  public void setcVlan(Integer cVlan) {
    this.cVlan = cVlan;
  }


  public LineResourcesBroadband uVlan(Integer uVlan) {
    
    this.uVlan = uVlan;
    return this;
  }

   /**
   * U-VLAN of the line&#39;s circuit
   * minimum: 0
   * maximum: 4095
   * @return uVlan
  **/
  public Integer getuVlan() {
    return uVlan;
  }


  public void setuVlan(Integer uVlan) {
    this.uVlan = uVlan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineResourcesBroadband lineResourcesBroadband = (LineResourcesBroadband) o;
    return Objects.equals(this.sVlan, lineResourcesBroadband.sVlan) &&
        Objects.equals(this.cVlan, lineResourcesBroadband.cVlan) &&
        Objects.equals(this.uVlan, lineResourcesBroadband.uVlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sVlan, cVlan, uVlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineResourcesBroadband {\n");
    sb.append("    sVlan: ").append(toIndentedString(sVlan)).append("\n");
    sb.append("    cVlan: ").append(toIndentedString(cVlan)).append("\n");
    sb.append("    uVlan: ").append(toIndentedString(uVlan)).append("\n");
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

