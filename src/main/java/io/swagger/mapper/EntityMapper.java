package io.swagger.mapper;

import io.swagger.entity.ActionEntity;
import io.swagger.entity.ProjectEntity;
import io.swagger.model.Action;
import io.swagger.model.ActionList;
import io.swagger.model.Project;
import io.swagger.model.ProjectList;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface EntityMapper {

    Project map(ProjectEntity value);

    ProjectEntity mapBack(Project value);

    @Mapping(source = "project.id", target = "projectId")
    Action map(ActionEntity value);

    @InheritInverseConfiguration
    ActionEntity mapBack(Action value);


    default ProjectList mapList(List<ProjectEntity> value) {
        ProjectList ret = new ProjectList();
        ret.setList(value.stream().map(this::map).collect(Collectors.toList()));
        return ret;
    }

    default ActionList mapActions(List<ActionEntity> value) {
        ActionList ret = new ActionList();
        ret.setList(value.stream().map(this::map).collect(Collectors.toList()));
        return ret;
    }
}
