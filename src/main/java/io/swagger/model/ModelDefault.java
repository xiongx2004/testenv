package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 返回结果
 */
@ApiModel(description = "返回结果")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-16T07:09:36.720Z")

public class ModelDefault   {
  @JsonProperty("result")
  private Boolean result = null;

  @JsonProperty("name")
  private String name = null;

  public ModelDefault result(Boolean result) {
    this.result = result;
    return this;
  }

  /**
   * 结果
   * @return result
  **/
  @ApiModelProperty(value = "结果")


  public Boolean isResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public ModelDefault name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 用户信息
   * @return name
  **/
  @ApiModelProperty(value = "用户信息")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDefault _default = (ModelDefault) o;
    return Objects.equals(this.result, _default.result) &&
        Objects.equals(this.name, _default.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDefault {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

