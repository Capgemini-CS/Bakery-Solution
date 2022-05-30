package com.capgemini.bakery.taxonomy.shop.service;


import com.capgemini.bakery.taxonomy.shop.model.dto.ShopDto;
import com.capgemini.bakery.taxonomy.shop.model.entity.Shop;
import com.capgemini.bakery.taxonomy.shop.model.mapper.ShopMapper;
import com.capgemini.bakery.taxonomy.shop.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShopService {

    private final ShopRepository shopRepository;

    @Autowired
    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }


    public ShopDto add(ShopDto shopDto) {
        Shop shop = shopRepository.save(ShopMapper.shopDtoToShop(shopDto));
        return ShopMapper.shopToShopDto(shop);
    }

    public List<ShopDto> getAll() {
        return shopRepository.findAll().stream().map(ShopMapper::shopToShopDto).collect(Collectors.toList());
    }

    public ShopDto getById(Long id) {
        Shop shop = shopRepository.getReferenceById(id);
        return ShopMapper.shopToShopDto(shop);
    }

    public ShopDto deleteById(Long id) {
        Shop shopBeforeDelete = shopRepository.getReferenceById(id);
        shopRepository.deleteById(id);
        return ShopMapper.shopToShopDto(shopBeforeDelete);
    }

    public ShopDto updateRegionByID(Long id, ShopDto shopDto) {
        Shop shopPreviously = new Shop();
        if (shopRepository.findById(id).isPresent()) {
            shopPreviously = ShopMapper.shopDtoToShop(shopDto);
        } else {
            System.out.println("qweqdsadczx");
        }
        Shop shopUpdated = new Shop();
        shopUpdated.setId(id);
        shopUpdated.setDivision(shopPreviously.getDivision());
        shopUpdated.setRegion(shopPreviously.getRegion());
        shopUpdated.setArea(shopPreviously.getArea());
        shopRepository.save(shopUpdated);
        return ShopMapper.shopToShopDto(shopUpdated);
    }
}