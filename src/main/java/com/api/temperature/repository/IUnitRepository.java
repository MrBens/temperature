package com.api.temperature.repository;

import com.api.temperature.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUnitRepository extends JpaRepository<Unit, Integer> {

  boolean existsByName(String name);
}
