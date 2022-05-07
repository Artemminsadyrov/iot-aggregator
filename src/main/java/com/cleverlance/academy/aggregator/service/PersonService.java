package com.cleverlance.academy.aggregator.service;

import com.cleverlance.academy.aggregator.model.Person;
import javax.validation.Valid;

public interface PersonService {

    void save(@Valid Person person);
}