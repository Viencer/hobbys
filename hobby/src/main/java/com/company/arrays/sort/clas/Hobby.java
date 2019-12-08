package com.company.arrays.sort.clas;

import java.io.Externalizable;
import java.io.Serializable;

public abstract class Hobby implements Serializable {
    protected String name;
    protected long stars;
    protected int hobbys;
    protected short legs;
    protected byte arms;
    protected float weeks;
    protected double years;
    protected char firstNameChar;
    protected boolean human;

    public Hobby(long stars, int hobbys, short legs, byte arms, float weeks, double years, String name, boolean human) {
        this.stars = stars;
        this.hobbys = hobbys;
        this.legs = legs;
        this.arms = arms;
        this.weeks = weeks;
        this.years = years;
        this.name = name;
        this.human = human;
    }

    public Hobby(char firstNameChar, boolean human, String name) {
        this.firstNameChar = firstNameChar;
        this.human = human;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStars() {
        return stars;
    }

    public void setStars(long stars) {
        this.stars = stars;
    }

    public int getHobbys() {
        return hobbys;
    }

    public void setHobbys(int hobbys) {
        this.hobbys = hobbys;
    }

    public short getLegs() {
        return legs;
    }

    public void setLegs(short legs) {
        this.legs = legs;
    }

    public byte getArms() {
        return arms;
    }

    public void setArms(byte arms) {
        this.arms = arms;
    }

    public float getWeeks() {
        return weeks;
    }

    public void setWeeks(float weeks) {
        this.weeks = weeks;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public boolean isHuman() {
        return human;
    }

    public void setHuman(boolean human) {
        this.human = human;
    }

    public abstract String tellAboutHobby();

}
