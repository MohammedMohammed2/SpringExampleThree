package com.SpringExampleThree.VehiclesTaxicos;

import com.SpringExampleThree.Taxicos.Taxicos;
import com.SpringExampleThree.Vehicles.Vehicles;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "vehicles_taxicos")
@Table(name = "vehicles_taxicos")
@Data
public class VehiclesTaxicos {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "taxicos_id",referencedColumnName = "id")
    private Taxicos taxicos;

    @ManyToOne
    @JoinColumn(name = "vehicles_id",referencedColumnName = "id")
    private Vehicles vehicles;


}
