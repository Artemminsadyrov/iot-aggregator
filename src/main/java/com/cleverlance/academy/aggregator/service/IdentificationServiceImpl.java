package com.cleverlance.academy.aggregator.service;

import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.repository.IdentificationRepository;
import org.springframework.stereotype.Service;

@Service
public class IdentificationServiceImpl implements IdentificationService{


    private final IdentificationRepository IdentificationRepository;

    public IdentificationServiceImpl(IdentificationRepository identificationRepository) {
        this.IdentificationRepository = identificationRepository;
    }

    @Override
    public Identification getIdentification() {
        return this.IdentificationRepository.getIdentification();
    }
}
