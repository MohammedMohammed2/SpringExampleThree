package com.SpringExampleThree.Taxicos;

import com.SpringExampleThree.Vehicles.Vehicles;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "taxicos")
@Table(name = "taxicos")
@Data
public class Taxicos {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "vehicles_taxicos", joinColumns = @JoinColumn(name = "taxicos_id"),
            inverseJoinColumns = @JoinColumn(name = "vehicles_id"))
   private Set<Vehicles> vehicles = new HashSet<>();
}
