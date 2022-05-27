package com.capgemini.bakery.taxonomy.region.repository;

import com.capgemini.bakery.taxonomy.region.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
