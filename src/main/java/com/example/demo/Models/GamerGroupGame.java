package com.example.demo.Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class GamerGroupGame implements Serializable {


    private String playstyle;
    @Id
    @ManyToOne
    @JoinColumn(name="game_id")
    private Game games;

    @Id
    @ManyToOne
    @JoinColumn(name="gamegroup_id")
    private GamerGroup gamerGroup;

    public GamerGroupGame(Game games, GamerGroup gamerGroup) {
        this.games = games;
        this.gamerGroup = gamerGroup;
    }

    public void setPlaystyle(String playstyle) {
        this.playstyle = playstyle;
    }
}
