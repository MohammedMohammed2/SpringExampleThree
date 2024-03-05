package com.SpringExampleThree.Vehicles;

import com.SpringExampleThree.Taxicos.Taxicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiclesRepository extends JpaRepository<Vehicles,Integer>{

    List<Taxicos> findTaxicosById(Integer id);

}
