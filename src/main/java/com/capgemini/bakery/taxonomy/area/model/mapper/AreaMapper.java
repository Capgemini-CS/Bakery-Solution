package com.capgemini.bakery.taxonomy.area.model.mapper;

import com.capgemini.bakery.taxonomy.area.model.Area;
import com.capgemini.bakery.taxonomy.area.model.dto.AreaDTO;
import org.dozer.DozerBeanMapper;

public class AreaMapper {

    public static AreaDTO toAreaDTO(Area area) {
        AreaDTO areaDTO = new DozerBeanMapper().map(area,AreaDTO.class);
        return areaDTO;
    }

    public static Area toArea(AreaDTO areaDTO){
        Area area = new DozerBeanMapper().map(areaDTO, Area.class);
        return area;
    }
}
