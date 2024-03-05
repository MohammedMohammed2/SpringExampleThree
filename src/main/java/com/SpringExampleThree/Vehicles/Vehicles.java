package com.SpringExampleThree.Vehicles;

import com.SpringExampleThree.Taxicos.Taxicos;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "vehicles")
@Table(name = "vehicles")
@Data
public class Vehicles {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "year")
    private String year;

    @ManyToMany(mappedBy = "vehicles")
    private Set<Taxicos> taxicos = new HashSet<>();
}
