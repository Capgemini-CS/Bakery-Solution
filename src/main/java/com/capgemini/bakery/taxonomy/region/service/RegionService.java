package com.capgemini.bakery.taxonomy.region.service;

import com.capgemini.bakery.taxonomy.region.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionService {

    private final RegionRepository regionRepository;

    @Autowired
    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    //TODO implement CRUD Operations
}
