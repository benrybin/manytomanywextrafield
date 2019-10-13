package com.example.demo.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class GamerGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy = "gamerGroup", cascade = CascadeType.ALL)
    private List<GamerGroupGame> nothing;
}
