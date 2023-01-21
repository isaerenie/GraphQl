package com.eren.graphql.repo;

import com.eren.graphql.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByTypeLikeIgnoreCase(String type);

}