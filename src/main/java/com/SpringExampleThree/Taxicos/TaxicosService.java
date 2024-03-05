package com.SpringExampleThree.Taxicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxicosService {
    @Autowired
    TaxicosRepository taxicosRepository;

    List<Taxicos>getTaxicos(){
        return taxicosRepository.findAll();
    }
}
