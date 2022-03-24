package com.nttdata.model.tmf639;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

/**
 * Outside plant ODF resources
 */

@JsonTypeName("LineResources_odf")
public class LineResourcesOdf {

  private String popId;
  private String odfId;
  private String opvModule;
  private String opvModuleType;
  private String opvPort;
  private String otbPort;
  private String ipvModule;
  private String ipvModuleType;
  private String ipvPort;


  public LineResourcesOdf popId(String popId) {
    
    this.popId = popId;
    return this;
  }

   /**
   * ODF POP identifier
   * @return popId
  **/

  public String getPopId() {
    return popId;
  }


  public void setPopId(String popId) {
    this.popId = popId;
  }


  public LineResourcesOdf odfId(String odfId) {
    
    this.odfId = odfId;
    return this;
  }

   /**
   * ODF identifier
   * @return odfId
  **/

  public String getOdfId() {
    return odfId;
  }


  public void setOdfId(String odfId) {
    this.odfId = odfId;
  }


  public LineResourcesOdf opvModule(String opvModule) {
    
    this.opvModule = opvModule;
    return this;
  }

   /**
   * Position of the OPV module within the OP vertical. For modules that occupy more than one position, the number will be the first position in the OPV. 
   * @return opvModule
  **/

  public String getOpvModule() {
    return opvModule;
  }


  public void setOpvModule(String opvModule) {
    this.opvModule = opvModule;
  }


  public LineResourcesOdf opvModuleType(String opvModuleType) {
    
    this.opvModuleType = opvModuleType;
    return this;
  }

   /**
   * Type of the OPV module: SC48, SC96, SC144, SC192, SC288
   * @return opvModuleType
  **/

  public String getOpvModuleType() {
    return opvModuleType;
  }


  public void setOpvModuleType(String opvModuleType) {
    this.opvModuleType = opvModuleType;
  }


  public LineResourcesOdf opvPort(String opvPort) {
    
    this.opvPort = opvPort;
    return this;
  }

   /**
   * OPV port identifier within the module
   * @return opvPort
  **/
  public String getOpvPort() {
    return opvPort;
  }


  public void setOpvPort(String opvPort) {
    this.opvPort = opvPort;
  }


  public LineResourcesOdf otbPort(String otbPort) {
    
    this.otbPort = otbPort;
    return this;
  }

   /**
   * OTB port identifier within the OTB that corresponds to the requested HomeId 
   * @return otbPort
  **/


  public String getOtbPort() {
    return otbPort;
  }


  public void setOtbPort(String otbPort) {
    this.otbPort = otbPort;
  }


  public LineResourcesOdf ipvModule(String ipvModule) {
    
    this.ipvModule = ipvModule;
    return this;
  }

   /**
   * Position of the OPV module within the IP vertical. For modules that occupy more than one position, the number will be the first position in the OPV. 
   * @return ipvModule
  **/


  public String getIpvModule() {
    return ipvModule;
  }


  public void setIpvModule(String ipvModule) {
    this.ipvModule = ipvModule;
  }


  public LineResourcesOdf ipvModuleType(String ipvModuleType) {
    
    this.ipvModuleType = ipvModuleType;
    return this;
  }

   /**
   * Type of the IPV module: PP48, SPL64
   * @return ipvModuleType
  **/


  public String getIpvModuleType() {
    return ipvModuleType;
  }


  public void setIpvModuleType(String ipvModuleType) {
    this.ipvModuleType = ipvModuleType;
  }


  public LineResourcesOdf ipvPort(String ipvPort) {
    
    this.ipvPort = ipvPort;
    return this;
  }

   /**
   * IPV port identifier within the module
   * @return ipvPort
  **/


  public String getIpvPort() {
    return ipvPort;
  }


  public void setIpvPort(String ipvPort) {
    this.ipvPort = ipvPort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineResourcesOdf lineResourcesOdf = (LineResourcesOdf) o;
    return Objects.equals(this.popId, lineResourcesOdf.popId) &&
        Objects.equals(this.odfId, lineResourcesOdf.odfId) &&
        Objects.equals(this.opvModule, lineResourcesOdf.opvModule) &&
        Objects.equals(this.opvModuleType, lineResourcesOdf.opvModuleType) &&
        Objects.equals(this.opvPort, lineResourcesOdf.opvPort) &&
        Objects.equals(this.otbPort, lineResourcesOdf.otbPort) &&
        Objects.equals(this.ipvModule, lineResourcesOdf.ipvModule) &&
        Objects.equals(this.ipvModuleType, lineResourcesOdf.ipvModuleType) &&
        Objects.equals(this.ipvPort, lineResourcesOdf.ipvPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(popId, odfId, opvModule, opvModuleType, opvPort, otbPort, ipvModule, ipvModuleType, ipvPort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineResourcesOdf {\n");
    sb.append("    popId: ").append(toIndentedString(popId)).append("\n");
    sb.append("    odfId: ").append(toIndentedString(odfId)).append("\n");
    sb.append("    opvModule: ").append(toIndentedString(opvModule)).append("\n");
    sb.append("    opvModuleType: ").append(toIndentedString(opvModuleType)).append("\n");
    sb.append("    opvPort: ").append(toIndentedString(opvPort)).append("\n");
    sb.append("    otbPort: ").append(toIndentedString(otbPort)).append("\n");
    sb.append("    ipvModule: ").append(toIndentedString(ipvModule)).append("\n");
    sb.append("    ipvModuleType: ").append(toIndentedString(ipvModuleType)).append("\n");
    sb.append("    ipvPort: ").append(toIndentedString(ipvPort)).append("\n");
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

