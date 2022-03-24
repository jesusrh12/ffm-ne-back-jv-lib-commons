package com.nttdata.model.tmf639;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

/**
 * Error
 */

@JsonTypeName("Error")
public class Error {

  private Integer code;
  private String reason;
  private String target;
  private String message;


  public Error code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * Error code
   * @return code
  **/

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public Error reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Error reason
   * @return reason
  **/

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public Error target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * Failed resource
   * @return target
  **/

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public Error message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * User-friendly error message with details
   * @return message
  **/
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.reason, error.reason) &&
        Objects.equals(this.target, error.target) &&
        Objects.equals(this.message, error.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, reason, target, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

