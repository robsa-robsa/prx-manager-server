package io.swagger.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.persistence.*;
import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Action DB
 */


@Entity
@Table(name = "action")
@Getter
@Setter
@NoArgsConstructor
public class Action {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "time")
  private OffsetDateTime time;

  @ManyToOne
  private Project project;

  @Column(name = "efford")
  private BigDecimal efford;

  @Column(name = "members")
  private BigDecimal members;
}

