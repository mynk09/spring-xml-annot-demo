package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
    private Actor actor3;


    public void role(){
        System.out.println(this.actor3);
    }
}
