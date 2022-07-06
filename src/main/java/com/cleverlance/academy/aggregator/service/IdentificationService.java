package com.cleverlance.academy.aggregator.service;

import com.cleverlance.academy.aggregator.model.Identification;
import java.util.List;

public interface IdentificationService {
    List<Identification> getIdentification();

    void saveIdentification(Identification identification);
}