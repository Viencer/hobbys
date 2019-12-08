package com.company.arrays.sort.clas;

import java.io.*;

public class Karate extends Hobby implements Serializable {
    int hits;
    String belt;
    int mass;

    public Karate(long stars, int hobbys, short legs, byte arms, float weeks, double years, String name, int hits, String belt, int mass, boolean human ) {
        super(stars, hobbys, legs, arms, weeks, years, name, human);
        this.hits = hits;
        this.belt = belt;
        this.mass = mass;
    }

    public void getMass() throws HobbyExeptions {
        if(mass > 60){
            throw new HobbyExeptions("you can't hit children");
        }
    }

    @Override
    public String tellAboutHobby()  {
        return "Karate{" +
                "hits=" + hits +
                ", belt='" + belt + '\'' +
                ", mass=" + mass +
                ", name='" + name + '\'' +
                ", stars=" + stars +
                ", hobbys=" + hobbys +
                ", legs=" + legs +
                ", arms=" + arms +
                ", weeks=" + weeks +
                ", years=" + years +
                ", human=" + human +
                '}';
    }
}
