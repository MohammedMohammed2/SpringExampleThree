package com.SpringExampleThree.Vehicles;

import com.SpringExampleThree.Taxicos.Taxicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiclesService {
    @Autowired
    VehiclesRepository vehiclesRepository;

    List<Vehicles> getVehicles(){
        return vehiclesRepository.findAll();
    }

    List<Taxicos> getTaxicosForVehicle(Integer id){
        return vehiclesRepository.findTaxicosById(id);
    }
}
