package com.eren.graphql.api;



import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.eren.graphql.model.Vehicle;
import com.eren.graphql.repo.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
@RequiredArgsConstructor
public class VehicleQueryResolver implements GraphQLQueryResolver {
    final VehicleRepository vehicleRepository;
    public List<Vehicle> getVehicles(String type) {
        return vehicleRepository.findByTypeLikeIgnoreCase(type);
    }

    public Optional<Vehicle> getById(Long id) {
        return vehicleRepository.findById(id);
    }
}