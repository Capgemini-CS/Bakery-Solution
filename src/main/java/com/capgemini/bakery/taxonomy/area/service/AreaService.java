package com.capgemini.bakery.taxonomy.area.service;

import com.capgemini.bakery.taxonomy.area.model.Area;
import com.capgemini.bakery.taxonomy.area.model.dto.AreaDTO;
import com.capgemini.bakery.taxonomy.area.model.mapper.AreaMapper;
import com.capgemini.bakery.taxonomy.area.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AreaService {

    private final AreaRepository areaRepository;

    @Autowired
    public AreaService(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    //TODO implement CRUD Operations

    public AreaDTO addArea(AreaDTO areaDTO){
        Area area = areaRepository.save(AreaMapper.toArea(areaDTO));
        return AreaMapper.toAreaDTO(area);
    }

    public List<AreaDTO> getAllAreas(){
        return areaRepository.findAll().stream().map(AreaMapper::toAreaDTO).collect(Collectors.toList());
    }

    public AreaDTO getAreaByID(Integer areaId){
        Area area = areaRepository.getReferenceById(areaId);
        return AreaMapper.toAreaDTO(area);
    }

    public AreaDTO deleteByID(Integer areaId){
        Area areaBeforeDelete = areaRepository.getReferenceById(areaId);
        areaRepository.deleteById(areaId);
        return AreaMapper.toAreaDTO(areaBeforeDelete);
    }

    public AreaDTO updateAreaByID(Integer areaId, AreaDTO areaDTO){
        Area areaPreviously = new Area();
        if(areaRepository.findById(areaId).isPresent()){
            areaPreviously = AreaMapper.toArea(areaDTO);
        } else {
            System.out.println("qweqdsadczx");
        }
        Area areaUpdated = new Area();
        areaUpdated.setAreaId(areaId);
        areaUpdated.setCode(areaPreviously.getCode());
        areaUpdated.setName(areaPreviously.getName());
        areaRepository.save(areaUpdated);
        return AreaMapper.toAreaDTO(areaUpdated);
    }
}
