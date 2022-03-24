
package com.nttdata.model.tmf639;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/**
 * LineData
 */

@JsonTypeName("LineData")
public class LineData {

  private String lineId;
  private ProvisionStatus status;
  private OffsetDateTime creationDate;
  private OffsetDateTime lastModifiedDate;
  private Long objectVersion;
  private LineOrder order;
  private LineResources resources;
  private LineOrder oldOrder;
  private LineResources oldResources;



  public String getLineId() {
    return lineId;
  }

  public void setLineId(String lineId) {
    this.lineId = lineId;
  }

  public ProvisionStatus getStatus() {
    return status;
  }

  public void setStatus(ProvisionStatus status) {
    this.status = status;
  }

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public Long getObjectVersion() {
    return objectVersion;
  }

  public void setObjectVersion(Long objectVersion) {
    this.objectVersion = objectVersion;
  }

  public LineOrder getOrder() {
    return order;
  }

  public void setOrder(LineOrder order) {
    this.order = order;
  }

  public LineResources getResources() {
    return resources;
  }

  public void setResources(LineResources resources) {
    this.resources = resources;
  }

  public LineOrder getOldOrder() {
    return oldOrder;
  }

  public void setOldOrder(LineOrder oldOrder) {
    this.oldOrder = oldOrder;
  }

  public LineResources getOldResources() {
    return oldResources;
  }

  public void setOldResources(LineResources oldResources) {
    this.oldResources = oldResources;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineData {\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    objectVersion: ").append(toIndentedString(objectVersion)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    oldOrder: ").append(toIndentedString(oldOrder)).append("\n");
    sb.append("    oldResources: ").append(toIndentedString(oldResources)).append("\n");
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

