package com.statefarm.pets;

import com.statefarm.food.Food;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class AlligatorTest {

    Alligator alligator1;
    Food testFood1;
    Food testFood2;
    Food testFood3;
    ArrayList<Food> foods;

    @BeforeEach
    public void setUpAlligator() {
        testFood1 = new Food("catfish");
        testFood2 = new Food("mink");
        testFood3 = new Food("grapes");
        foods = new ArrayList<>(Arrays.asList(testFood1, testFood2, testFood3));

        alligator1 = new Alligator("Earl", 'm', 45, foods, 16);
    }

    @Test
    public void attack() {
        ArrayList<String> attacks = new ArrayList<>(Arrays.asList(alligator1.getName() + " snapped at you", alligator1.getName() + " bit you", alligator1.getName() + " lunged at you...you peed a little"));
        String result = alligator1.attack();
        assertTrue(attacks.contains(result));
    }

    @Test
    public void playWithCheckHunger() {
        alligator1.playWith();
        assertFalse(alligator1.isHungry());
    }

    @Test
    public void playWith() {
        //"You are now dead" + this.getName() + " is full"
        String result = alligator1.playWith();
        assertEquals("You are now dead" + alligator1.getName() + " is full", result);
    }

    @Test
    public void pet() {
        String result = alligator1.pet();
        assertEquals("You are now missing a hand...was it worth it?", result);
    }

    @Test
    public void petCheckHunger() {
        alligator1.pet();
        assertTrue(alligator1.isHungry());
    }

}
