package com.capgemini.bakery.taxonomy.region.service;

import com.capgemini.bakery.taxonomy.region.model.Region;
import com.capgemini.bakery.taxonomy.region.model.dto.RegionDTO;
import com.capgemini.bakery.taxonomy.region.model.mapper.RegionMapper;
import com.capgemini.bakery.taxonomy.region.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegionService {

    private final RegionRepository regionRepository;

    @Autowired
    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }


    public RegionDTO addRegion(RegionDTO regionDTO){
        Region region = regionRepository.save(RegionMapper.toRegion(regionDTO));
        return RegionMapper.toRegionDTO(region);
    }

    public List<RegionDTO> getAllRegions(){
        return regionRepository.findAll().stream().map(RegionMapper::toRegionDTO).collect(Collectors.toList());
    }

    public RegionDTO getRegionByID(Integer regionID){
        Region region = regionRepository.getReferenceById(regionID);
        return RegionMapper.toRegionDTO(region);
    }

    public RegionDTO deleteByID(Integer regionID){
        Region regionBeforeDelete = regionRepository.getReferenceById(regionID);
        regionRepository.deleteById(regionID);
        return RegionMapper.toRegionDTO(regionBeforeDelete);
    }

    public RegionDTO updateRegionByID(Integer regionID, RegionDTO regionDTO){
        Region regionPreviously = new Region();
        if(regionRepository.findById(regionID).isPresent()){
            regionPreviously = RegionMapper.toRegion(regionDTO);
        } else {
            System.out.println("qweqdsadczx");
        }
        Region regionUpdated = new Region();
        regionUpdated.setRegion_id(regionID);
        regionUpdated.setCode(regionPreviously.getCode());
        regionUpdated.setName(regionPreviously.getName());
        regionRepository.save(regionUpdated);
        return RegionMapper.toRegionDTO(regionUpdated);
    }
}
