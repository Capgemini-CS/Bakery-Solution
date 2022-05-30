package com.capgemini.bakery.taxonomy.area.service;

import com.capgemini.bakery.taxonomy.area.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaService {

    private final AreaRepository areaRepository;

    @Autowired
    public AreaService(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    //TODO implement CRUD Operations
}
