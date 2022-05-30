package com.capgemini.bakery.taxonomy.area.model.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AreaDTO {

    private Integer areaId;
    @NotNull
    private String code;
    @NotNull
    private String name;
}
