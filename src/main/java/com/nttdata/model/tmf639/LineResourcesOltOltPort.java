package com.nttdata.model.tmf639;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

/**
 * OLT port
 */

@JsonTypeName("LineResources_olt_oltPort")
public class LineResourcesOltOltPort {

  private String rack;
  private String shelf;
  private String slot;
  private String port;


  public LineResourcesOltOltPort rack(String rack) {
    
    this.rack = rack;
    return this;
  }

   /**
   * Get rack
   * @return rack
  **/

  public String getRack() {
    return rack;
  }


  public void setRack(String rack) {
    this.rack = rack;
  }


  public LineResourcesOltOltPort shelf(String shelf) {
    
    this.shelf = shelf;
    return this;
  }

   /**
   * Get shelf
   * @return shelf
  **/

  public String getShelf() {
    return shelf;
  }


  public void setShelf(String shelf) {
    this.shelf = shelf;
  }


  public LineResourcesOltOltPort slot(String slot) {
    
    this.slot = slot;
    return this;
  }

   /**
   * Get slot
   * @return slot
  **/

  public String getSlot() {
    return slot;
  }


  public void setSlot(String slot) {
    this.slot = slot;
  }


  public LineResourcesOltOltPort port(String port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/

  public String getPort() {
    return port;
  }


  public void setPort(String port) {
    this.port = port;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineResourcesOltOltPort lineResourcesOltOltPort = (LineResourcesOltOltPort) o;
    return Objects.equals(this.rack, lineResourcesOltOltPort.rack) &&
        Objects.equals(this.shelf, lineResourcesOltOltPort.shelf) &&
        Objects.equals(this.slot, lineResourcesOltOltPort.slot) &&
        Objects.equals(this.port, lineResourcesOltOltPort.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rack, shelf, slot, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineResourcesOltOltPort {\n");
    sb.append("    rack: ").append(toIndentedString(rack)).append("\n");
    sb.append("    shelf: ").append(toIndentedString(shelf)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

