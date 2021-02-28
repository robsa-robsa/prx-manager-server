package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Action;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActionList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-27T16:19:37.767Z")




public class ActionList   {
  @JsonProperty("list")
  @Valid
  private List<Action> _list = null;

  public ActionList _list(List<Action> _list) {
    this._list = _list;
    return this;
  }

  public ActionList addListItem(Action _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<Action>();
    }
    this._list.add(_listItem);
    return this;
  }

  /**
   * Get _list
   * @return _list
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Action> getList() {
    return _list;
  }

  public void setList(List<Action> _list) {
    this._list = _list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionList actionList = (ActionList) o;
    return Objects.equals(this._list, actionList._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionList {\n");
    
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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

