package com.capgemini.bakery.taxonomy.shop.repository;

import com.capgemini.bakery.taxonomy.shop.model.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
}
