package io.swagger.api;

import io.swagger.model.Action;
import io.swagger.model.ActionList;
import io.swagger.model.Project;
import io.swagger.model.ProjectList;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProjectApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addAction(@ApiParam(value = "ID",required=true) @PathVariable("pId") Long pId,@ApiParam(value = "a new special Action" ,required=true )  @Valid @RequestBody Action body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProjectList> addProject(@ApiParam(value = "a new special Project" ,required=true )  @Valid @RequestBody Project body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProjectList>(objectMapper.readValue("{  \"list\" : [ {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : 0,    \"category\" : \"category\",    \"actions\" : 6.02745618307040320615897144307382404804229736328125,    \"status\" : { }  }, {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : 0,    \"category\" : \"category\",    \"actions\" : 6.02745618307040320615897144307382404804229736328125,    \"status\" : { }  } ]}", ProjectList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProjectList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProjectList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteProject(@ApiParam(value = "ID",required=true) @PathVariable("pId") Long pId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Project> getProject(@ApiParam(value = "ID",required=true) @PathVariable("pId") Long pId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Project>(objectMapper.readValue("{  \"name\" : \"name\",  \"description\" : \"description\",  \"id\" : 0,  \"category\" : \"category\",  \"actions\" : 6.02745618307040320615897144307382404804229736328125,  \"status\" : { }}", Project.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Project>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Project>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ActionList> listActions(@ApiParam(value = "ID",required=true) @PathVariable("pId") Long pId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ActionList>(objectMapper.readValue("{  \"list\" : [ {    \"members\" : 5.962133916683182377482808078639209270477294921875,    \"name\" : \"name\",    \"description\" : \"description\",    \"efford\" : 1.46581298050294517310021547018550336360931396484375,    \"id\" : 0,    \"time\" : \"2000-01-23T04:56:07.000+00:00\",    \"projectId\" : 6  }, {    \"members\" : 5.962133916683182377482808078639209270477294921875,    \"name\" : \"name\",    \"description\" : \"description\",    \"efford\" : 1.46581298050294517310021547018550336360931396484375,    \"id\" : 0,    \"time\" : \"2000-01-23T04:56:07.000+00:00\",    \"projectId\" : 6  } ]}", ActionList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ActionList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ActionList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProjectList> listProjects() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProjectList>(objectMapper.readValue("{  \"list\" : [ {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : 0,    \"category\" : \"category\",    \"actions\" : 6.02745618307040320615897144307382404804229736328125,    \"status\" : { }  }, {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : 0,    \"category\" : \"category\",    \"actions\" : 6.02745618307040320615897144307382404804229736328125,    \"status\" : { }  } ]}", ProjectList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProjectList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProjectList>(HttpStatus.NOT_IMPLEMENTED);
    }

}
