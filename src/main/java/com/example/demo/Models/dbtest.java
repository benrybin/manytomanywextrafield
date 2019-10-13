package com.example.demo.Models;

import com.example.demo.Repo.repogames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dbtest {

    @Autowired
    private repogames repogames;


    public com.example.demo.Repo.repogames getRepogames() {
        return repogames;
    }

    public void setRepogames(com.example.demo.Repo.repogames repogames) {
        this.repogames = repogames;
    }
}
