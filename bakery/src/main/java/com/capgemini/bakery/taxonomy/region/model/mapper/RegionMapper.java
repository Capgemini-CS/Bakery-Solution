package com.capgemini.bakery.taxonomy.region.model.mapper;

import com.capgemini.bakery.taxonomy.region.model.Region;
import com.capgemini.bakery.taxonomy.region.model.dto.RegionDTO;
import org.dozer.DozerBeanMapper;

public class RegionMapper {

    public static RegionDTO toRegionDTO(Region region) {
        RegionDTO regionDTO = new DozerBeanMapper().map(region,RegionDTO.class);
        return regionDTO;
    }

    public static Region toRegion(RegionDTO regionDTO){
        Region region = new DozerBeanMapper().map(regionDTO, Region.class);
        return region;
    }
}
