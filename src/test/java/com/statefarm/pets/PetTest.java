package com.statefarm.pets;

import com.statefarm.food.Food;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {

    Pet testPet;
    Food testFood1;
    Food testFood2;
    Food testFood3;
    ArrayList<Food> foods;

    @BeforeEach
    public void generatePet() {

        testFood1 = new Food("baby gazelle");
        testFood2 = new Food("eel");
        testFood3 = new Food("grapes");
        foods = new ArrayList<>(Arrays.asList(testFood1, testFood2, testFood3));

        testPet = new Pet("Fluffy", 'f', 3, foods);
    }

    @Test
    public void petNameTest() {
        String result = testPet.getName();
        assertEquals("Fluffy", result);
    }

    @Test
    public void petSexTest() {
        char result = testPet.getSex();
        assertEquals('F', result);
    }

    @Test
    public void petAgeTest() {
        int result = testPet.getAge();
        assertEquals(3, result);
    }

    @Test
    public void petIsHungry() {
        boolean result = testPet.isHungry();
        assertEquals(false, result);
    }

    @Test
    public void isSick() {
        boolean result = testPet.isSick();
        assertEquals(false, result);
    }

    @Test
    public void setSick() {
        testPet.setSick(true);
        boolean result = testPet.isSick();
        assertEquals(true, result);
    }

    @Test
    public void feed() {
        testPet.feed();
        boolean result = testPet.isHungry();
        assertEquals(false, result);
    }

    @Test
    public void pet() {
        String result = testPet.pet();
        assertEquals("Yay! Your pet loves you.", result);
    }

    @Test
    public void doTrick() {
        String result = testPet.doTrick();
        assertEquals("Your pet can't do a trick!", result);
    }

    @Test
    public void attack() {
        String result = testPet.attack();
        assertEquals("Your pet can't attack.", result);
    }

    @Test
    public void takeToVet() {
        testPet.takeToVet();
        boolean result = testPet.isSick();
        assertEquals(false, result);
    }

    @Test
    public void playWith() {
        assertEquals("You played with your pet", testPet.playWith());
    }

}
