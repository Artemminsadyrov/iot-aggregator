package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.repository.IdentificationRepository;
import com.cleverlance.academy.aggregator.service.IdentificationService;
import org.openapitools.api.IdentificationApi;
import org.openapitools.model.Address;
import org.openapitools.model.Identification;
import org.openapitools.model.Owner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentificationController implements IdentificationApi {

    private final IdentificationService IdentificationService;

    public IdentificationController(IdentificationService identificationService) {
        this.IdentificationService = identificationService;
    }

    @Override
    public ResponseEntity<Identification> getIdentification() {
        com.cleverlance.academy.aggregator.model.Identification identification = this.IdentificationService.getIdentification();

        return ResponseEntity.ok(new Identification()
                .name("Moje meteostanice")
                .owner(new Owner().firstName("Jan").lastName("Novak"))
                .address(new Address()
                        .street("Hlavni")
                        .streetNumber("3")
                        .city("Praha")));
    }
}
