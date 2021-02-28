package io.swagger.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActionRepository extends JpaRepository<ActionEntity, Long> {
    List<ActionEntity> findAll();

}
