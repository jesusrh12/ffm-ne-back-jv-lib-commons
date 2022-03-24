package com.nttdata.model.tmf639;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * LineOrder
 */

public class LineOrder {

  private String homeId;
  private String ispId;
  private String orderType;
  private String connectionType;
  private LineOrderOnt ont;
  private LineOrderServices services;
  private Map<String, Object> other = null;



  public LineOrder homeId(String homeId) {
    
    this.homeId = homeId;
    return this;
  }

   /**
   * Normalized customer&#39;s home address identifier
   * @return homeId
  **/

  public String getHomeId() {
    return homeId;
  }


  public void setHomeId(String homeId) {
    this.homeId = homeId;
  }


  public LineOrder ispId(String ispId) {
    
    this.ispId = ispId;
    return this;
  }

   /**
   * ISP&#39;s identifier
   * @return ispId
  **/


  public String getIspId() {
    return ispId;
  }


  public void setIspId(String ispId) {
    this.ispId = ispId;
  }

  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public String getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }

  public LineOrder ont(LineOrderOnt ont) {
    
    this.ont = ont;
    return this;
  }

   /**
   * Get ont
   * @return ont
  **/

  public LineOrderOnt getOnt() {
    return ont;
  }


  public void setOnt(LineOrderOnt ont) {
    this.ont = ont;
  }


  public LineOrder services(LineOrderServices services) {
    
    this.services = services;
    return this;
  }

   /**
   * Get services
   * @return services
  **/

  public LineOrderServices getServices() {
    return services;
  }


  public void setServices(LineOrderServices services) {
    this.services = services;
  }


  public LineOrder other(Map<String, Object> other) {
    
    this.other = other;
    return this;
  }

  public LineOrder putOtherItem(String key, Object otherItem) {
    if (this.other == null) {
      this.other = new HashMap<String, Object>();
    }
    this.other.put(key, otherItem);
    return this;
  }

   /**
   * Any external values that must be associated with current line. Note: do not use the *other* values to pass any business-sensitive parameters to the interface! These values must be meaningless for the provision operations and used as simple data pass-through.
   * @return other
  **/

  public Map<String, Object> getOther() {
    return other;
  }


  public void setOther(Map<String, Object> other) {
    this.other = other;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineOrder lineOrder = (LineOrder) o;
    return Objects.equals(this.homeId, lineOrder.homeId) &&
        Objects.equals(this.ispId, lineOrder.ispId) &&
        Objects.equals(this.orderType, lineOrder.orderType) &&
        Objects.equals(this.connectionType, lineOrder.connectionType) &&
        Objects.equals(this.ont, lineOrder.ont) &&
        Objects.equals(this.services, lineOrder.services) &&
        Objects.equals(this.other, lineOrder.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homeId, ispId, orderType, connectionType, ont, services, other);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineOrder {\n");
    sb.append("    homeId: ").append(toIndentedString(homeId)).append("\n");
    sb.append("    ispId: ").append(toIndentedString(ispId)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    ont: ").append(toIndentedString(ont)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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

