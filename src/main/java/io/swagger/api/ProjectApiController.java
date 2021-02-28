package io.swagger.api;

import io.swagger.entity.ActionEntity;
import io.swagger.entity.ActionRepository;
import io.swagger.entity.ProjectEntity;
import io.swagger.entity.ProjectRepository;
import io.swagger.mapper.EntityMapper;
import io.swagger.model.Action;
import io.swagger.model.ActionList;
import io.swagger.model.Project;
import io.swagger.model.ProjectList;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-27T16:19:37.767Z")

@Controller
public class ProjectApiController implements ProjectApi {

    private static final Logger log = LoggerFactory.getLogger(ProjectApiController.class);

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    ActionRepository actionRepository;

    @Autowired
    EntityMapper mapper;

    private final HttpServletRequest request;
    private ProjectEntity exampleP;

    @org.springframework.beans.factory.annotation.Autowired
    public ProjectApiController(HttpServletRequest request) {
        this.request = request;
    }

    public ResponseEntity<Action> addAction(@ApiParam(value = "ID", required = true) @PathVariable("pId") Long pId, @ApiParam(value = "a new special Action", required = true) @Valid @RequestBody Action body) {

        ProjectEntity pentity = projectRepository.findOne(pId);
        if (pentity == null) {
            return new ResponseEntity<Action>(HttpStatus.BAD_REQUEST);
        }

        ActionEntity newEntity = mapper.mapBack(body);
        newEntity.setProject(pentity);
        ActionEntity entity = actionRepository.save(newEntity);

        if (entity == null) {
            return new ResponseEntity<Action>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<Action>(mapper.map(entity), HttpStatus.OK);
    }

    public ResponseEntity<Project> addProject(@ApiParam(value = "a new special Project", required = true) @Valid @RequestBody Project body) {
        ProjectEntity newEntity = mapper.mapBack(body);
        ProjectEntity entity = projectRepository.save(newEntity);

        if (entity == null) {
            return new ResponseEntity<Project>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<Project>(mapper.map(entity), HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteProject(@ApiParam(value = "ID", required = true) @PathVariable("pId") Long pId) {
        boolean entity = projectRepository.exists(pId);
        if (entity) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }

        List<ActionEntity> actions = actionRepository.findAll(getActionsLinkExample(pId));

        actionRepository.delete(actions);
        projectRepository.delete(pId);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    private Example<ActionEntity> getActionsLinkExample(Long pId) {
        ActionEntity example = new ActionEntity();
        ProjectEntity exampleP = new ProjectEntity();
        exampleP.setId(pId);
        example.setProject(exampleP);
        return Example.of(example);
    }

    public ResponseEntity<Project> getProject(@ApiParam(value = "ID", required = true) @PathVariable("pId") Long pId) {

        ProjectEntity entity = projectRepository.findOne(pId);
        if (entity == null) {
            return new ResponseEntity<Project>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Project>(mapper.map(entity), HttpStatus.OK);
    }

    public ResponseEntity<ActionList> listActions(@ApiParam(value = "ID", required = true) @PathVariable("pId") Long pId) {
        List<ActionEntity> entities = actionRepository.findAll(getActionsLinkExample(pId));
        return new ResponseEntity<ActionList>(mapper.mapActions(entities), HttpStatus.OK);
    }

    public ResponseEntity<ProjectList> listProjects() {
        List<ProjectEntity> entities = projectRepository.findAll();
        return new ResponseEntity<ProjectList>(mapper.mapList(entities), HttpStatus.OK);

    }

}
