package com.eren.graphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.eren.graphql.dto.VehicleDto;
import com.eren.graphql.model.Vehicle;
import com.eren.graphql.repo.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {
        final VehicleRepository vehicleRepository;
        final ModelMapper mapper;
    public Vehicle createVehicle(VehicleDto vehicleDto) {
        return vehicleRepository.save(mapper.map(vehicleDto, Vehicle.class));
    }
}
