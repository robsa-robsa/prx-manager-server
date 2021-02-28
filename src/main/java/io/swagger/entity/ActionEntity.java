package io.swagger.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.threeten.bp.OffsetDateTime;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Action DB
 */


@Entity
@Table(name = "action")
@Getter
@Setter
@NoArgsConstructor
public class ActionEntity {
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
  private ProjectEntity project;

  @Column(name = "efford")
  private BigDecimal efford;

  @Column(name = "members")
  private BigDecimal members;
}

