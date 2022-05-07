package com.cleverlance.academy.aggregator.model;


import lombok.Value;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Value
public class Person {
    private String firstName;
    private String lastName;

    @Email
    //@Column(name = "mail")
    //@NotBlank
    private String mail;

    private String gender;
}
