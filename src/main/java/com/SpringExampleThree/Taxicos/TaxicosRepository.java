package com.SpringExampleThree.Taxicos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface TaxicosRepository extends JpaRepository<Taxicos,Integer>{
}
