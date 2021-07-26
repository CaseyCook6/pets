package com.statefarm.pets;

import com.statefarm.food.Food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Pet {

    private String name;
    private char sex;
    private int age;
    private boolean isHungry;
    ArrayList<Food> food;
    private boolean isSick;

    public Pet(String name, char sex, int age, ArrayList<Food> food) {
        this.name = name;
        this.sex = Character.toUpperCase(sex);
        this.age = age;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public String doTrick() {
        return "Your pet can't do a trick!";
    }

    public String attack() {
        return "Your pet can't attack.";
    }

    public void takeToVet() {
        setSick(false);
    }

    public void feed() {
        setHungry(false);
    }

    public String playWith() {
        return null;
    }

    public String pet() {
        return "Yay! Your pet loves you.";
    }

}
