package com.capgemini.bakery.taxonomy.region.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table
public class Region {
    private Integer region_id;
    private String code;
    private String name;
}
