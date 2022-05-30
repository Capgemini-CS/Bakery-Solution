package com.capgemini.bakery.taxonomy.shop.model.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "SHOPS", schema = "BAKERY")

public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "division")
    private String division;

    @Column(name = "region")
    private String region;

    @Column(name = "area")
    private String area;

}
