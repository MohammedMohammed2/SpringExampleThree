package com.SpringExampleThree.VehiclesTaxicos;

import com.SpringExampleThree.Taxicos.Taxicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiclesTaxicosRepository extends JpaRepository<VehiclesTaxicos,Integer>{
}
