package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Action
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-27T16:19:37.767Z")




public class Action   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("time")
  private OffsetDateTime time = null;

  @JsonProperty("projectId")
  private Long projectId = null;

  @JsonProperty("efford")
  private BigDecimal efford = null;

  @JsonProperty("members")
  private BigDecimal members = null;

  public Action id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Action name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Action description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Action time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public Action projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(value = "")


  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public Action efford(BigDecimal efford) {
    this.efford = efford;
    return this;
  }

  /**
   * hours of work
   * @return efford
  **/
  @ApiModelProperty(value = "hours of work")

  @Valid

  public BigDecimal getEfford() {
    return efford;
  }

  public void setEfford(BigDecimal efford) {
    this.efford = efford;
  }

  public Action members(BigDecimal members) {
    this.members = members;
    return this;
  }

  /**
   * count members in this action
   * @return members
  **/
  @ApiModelProperty(value = "count members in this action")

  @Valid

  public BigDecimal getMembers() {
    return members;
  }

  public void setMembers(BigDecimal members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Action action = (Action) o;
    return Objects.equals(this.id, action.id) &&
        Objects.equals(this.name, action.name) &&
        Objects.equals(this.description, action.description) &&
        Objects.equals(this.time, action.time) &&
        Objects.equals(this.projectId, action.projectId) &&
        Objects.equals(this.efford, action.efford) &&
        Objects.equals(this.members, action.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, time, projectId, efford, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Action {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    efford: ").append(toIndentedString(efford)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

