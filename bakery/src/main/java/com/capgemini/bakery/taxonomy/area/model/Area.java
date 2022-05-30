package com.capgemini.bakery.taxonomy.area.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Area {
    @Id
    private Integer areaId;
    private String code;
    private String name;
}
