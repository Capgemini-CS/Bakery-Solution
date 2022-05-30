package com.capgemini.bakery.taxonomy.region.model.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegionDTO {

    private Integer region_id;
    @NotNull
    private String code;
    @NotNull
    private String name;
}
