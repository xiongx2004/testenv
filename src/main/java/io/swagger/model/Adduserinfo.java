package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Userinfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 新用户信息
 */
@ApiModel(description = "新用户信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-16T07:09:36.720Z")

public class Adduserinfo   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("user")
  private Userinfo user = null;

  public Adduserinfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * 用户的唯一标识
   * @return id
  **/
  @ApiModelProperty(value = "用户的唯一标识")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Adduserinfo user(Userinfo user) {
    this.user = user;
    return this;
  }

  /**
   * 用户信息
   * @return user
  **/
  @ApiModelProperty(value = "用户信息")

  @Valid

  public Userinfo getUser() {
    return user;
  }

  public void setUser(Userinfo user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Adduserinfo adduserinfo = (Adduserinfo) o;
    return Objects.equals(this.id, adduserinfo.id) &&
        Objects.equals(this.user, adduserinfo.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Adduserinfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

