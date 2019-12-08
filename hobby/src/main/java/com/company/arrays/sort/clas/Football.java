package com.company.arrays.sort.clas;

import java.io.*;
import org.apache.log4j.Logger;

public class Football extends Hobby implements Serializable {
    int players;
    boolean gameIsStart;
    double time;

    public Football(long stars, int hobbys, short legs, byte arms, float weeks, double years, String name, double time, int players, boolean gameIsStart, boolean human) throws HobbyExeptions{
        super(stars, hobbys, legs, arms, weeks, years, name, human);
        this.time = time;
        this.players = players;
        this.gameIsStart = gameIsStart;
        if (players > 23) {
            throw new HobbyExeptions("you have a lot of players1");
        }
    }

    public int getPlayers() throws HobbyExeptions {
        if (players > 22) {
            throw new HobbyExeptions("you have a lot of players2");
        }
        return players;

    }

    @Override
    public String tellAboutHobby(){
        return "Football{" +
                "players=" + players +
                ", gameIsStart=" + gameIsStart +
                ", time=" + time +
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
