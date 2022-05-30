package com.capgemini.bakery.taxonomy.shop.model.mapper;

import com.capgemini.bakery.taxonomy.shop.model.dto.ShopDto;
import com.capgemini.bakery.taxonomy.shop.model.entity.Shop;

public class ShopMapper {

    public static ShopDto shopToShopDto(Shop shop) {
        return ShopDto.builder()
                .id(shop.getId())
                .division(shop.getDivision())
                .region(shop.getRegion())
                .area(shop.getArea())
                .build();
    }

    public static Shop shopDtoToShop(ShopDto shopDto) {
        return Shop.builder()
                .id(shopDto.getId())
                .division(shopDto.getDivision())
                .region(shopDto.getRegion())
                .area(shopDto.getArea())
                .build();

    }
}
