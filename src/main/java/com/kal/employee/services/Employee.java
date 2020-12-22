package com.kal.employee.services;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Date;

@ApiModel(description="All details about the employee.")
@Entity
public class Employee  {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=3, message="Name should have at least 3 characters")
    @ApiModelProperty(notes="Name should have at least 3 characters")
    private String name;

    @Past
    private Date dateOfBirth;

    @Size(min=3, message="Roll should have at least 3 characters")
    @ApiModelProperty(notes="Roll should have at least 3 characters")
    private String roll;

    @Email(message = "Email should be valid")
    private String email;

    //@Pattern("^(\\d{3}[- .]?){2}\\d{4}$")
    //private Integer phoneNumber;


    public Employee(String name, Date dateOfBirth, String roll, String email) {
        super();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.roll = roll;
        this.email = email;
    }
    protected Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
