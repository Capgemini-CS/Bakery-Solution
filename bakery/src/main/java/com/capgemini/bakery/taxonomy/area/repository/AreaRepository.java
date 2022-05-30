package com.capgemini.bakery.taxonomy.area.repository;

import com.capgemini.bakery.taxonomy.area.model.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> {
}
