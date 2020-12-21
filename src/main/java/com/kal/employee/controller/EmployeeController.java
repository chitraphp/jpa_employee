package com.kal.employee.controller;

import com.kal.employee.exceptions.EmployeeNotFoundException;
import com.kal.employee.services.Employee;
import com.kal.employee.services.JpaEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class EmployeeController {
    @Autowired
    JpaEmployeeRepo jpaEmployeeRepo;
/***
    @GetMapping("/jpa/employees")
    public List<Employee> getAllEmployees() {
        return (List<Employee>) jpaEmployeeRepo.findAll();
    }

    @GetMapping("/jpa/users/{id}")
    public EntityModel<Employee> getUser(@PathVariable int id) {
        Optional<Employee> user = jpaEmployeeRepo.findById(id);

        if (!user.isPresent())
            throw new EmployeeNotFoundException("id-" + id);

        // "all-users", SERVER_PATH + "/users"
        // retrieveAllUsers
        EntityModel<Employee> resource = new EntityModel<Employee>(user.get());

        Link findLink = linkTo(methodOn(EmployeeController.class).getAllEmployees()).withSelfRel();

        resource.add(findLink.withRel("all-users"));
        // HATEOAS

        return resource;
    }

    @PostMapping("/jpa/employee")
    public ResponseEntity<Object> createUser(@Valid @RequestBody Employee user) {
        Employee savedUser = jpaEmployeeRepo.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();

    }


****/
}
