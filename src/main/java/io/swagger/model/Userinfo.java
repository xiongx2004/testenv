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
 * 用户信息
 */
@ApiModel(description = "用户信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-16T07:09:36.720Z")

public class Userinfo   {
  @JsonProperty("sex")
  private Boolean sex = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("age")
  private Integer age = null;

  public Userinfo sex(Boolean sex) {
    this.sex = sex;
    return this;
  }

  /**
   * 性别
   * @return sex
  **/
  @ApiModelProperty(value = "性别")


  public Boolean isSex() {
    return sex;
  }

  public void setSex(Boolean sex) {
    this.sex = sex;
  }

  public Userinfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 姓名
   * @return name
  **/
  @ApiModelProperty(value = "姓名")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Userinfo age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * 年龄
   * @return age
  **/
  @ApiModelProperty(value = "年龄")


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Userinfo userinfo = (Userinfo) o;
    return Objects.equals(this.sex, userinfo.sex) &&
        Objects.equals(this.name, userinfo.name) &&
        Objects.equals(this.age, userinfo.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sex, name, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Userinfo {\n");
    
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

