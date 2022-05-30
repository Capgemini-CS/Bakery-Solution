package com.capgemini.bakery.taxonomy.shop.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ShopDto {

    private Long id;

    private String division;

    private String region;

    private String area;

}
