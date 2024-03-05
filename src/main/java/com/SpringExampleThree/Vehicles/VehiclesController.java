package com.SpringExampleThree.Vehicles;

import com.SpringExampleThree.Taxicos.Taxicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehiclesController {
    @Autowired
    VehiclesService vehiclesService;
    @GetMapping(value = "/vehicles/",produces = MediaType.APPLICATION_JSON_VALUE)
    List<Vehicles> getVehicles(){
        return vehiclesService.getVehicles();

    }
    @GetMapping(value = "/vehicles/{id}/taxicos",produces = MediaType.APPLICATION_JSON_VALUE)
    List<Taxicos> getTaxicosForVehicle(
       @PathVariable(value = "id")Integer id
    ){
        return vehiclesService.getTaxicosForVehicle(id);

    }
}
