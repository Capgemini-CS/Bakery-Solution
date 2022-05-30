package com.capgemini.bakery.taxonomy.region.model;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Region {
    private Integer region_id;
    private String code;
    private String name;
}
