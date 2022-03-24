package com.nttdata.model.tmf639;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

/**
 * Customer&#39;s ONT physical equipment data
 */
@JsonTypeName("LineOrderOnt")
public class LineOrderOnt {

  private String vendor;
  private String model;
  private String version;
  private String serial;


  public LineOrderOnt vendor(String vendor) {
    
    this.vendor = vendor;
    return this;
  }

   /**
   * ONT Vendor
   * @return vendor
  **/

  public String getVendor() {
    return vendor;
  }


  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  public LineOrderOnt model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * ONT Model
   * @return model
  **/

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public LineOrderOnt version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * ONT Model Revision or Software version
   * @return version
  **/

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public LineOrderOnt serial(String serial) {
    
    this.serial = serial;
    return this;
  }

   /**
   * ONT Serial Number
   * @return serial
  **/

  public String getSerial() {
    return serial;
  }


  public void setSerial(String serial) {
    this.serial = serial;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineOrderOnt lineOrderOnt = (LineOrderOnt) o;
    return Objects.equals(this.vendor, lineOrderOnt.vendor) &&
        Objects.equals(this.model, lineOrderOnt.model) &&
        Objects.equals(this.version, lineOrderOnt.version) &&
        Objects.equals(this.serial, lineOrderOnt.serial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendor, model, version, serial);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineOrderOnt {\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
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

