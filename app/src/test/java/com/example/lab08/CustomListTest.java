package com.example.lab08;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CustomListTest {

    private CustomList cityList;

    @Before
    public void setUp() {
        cityList = new CustomList();
    }

    // 1️⃣ hasCity() test
    @Test
    public void testHasCity() {
        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");

        cityList.addCity(edmonton);

        assertTrue(cityList.hasCity(edmonton));
        assertFalse(cityList.hasCity(calgary));
    }

    // 2️⃣ deleteCity() test
    @Test
    public void testDeleteCity() {
        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");

        cityList.addCity(edmonton);
        cityList.addCity(calgary);

        cityList.deleteCity(edmonton);

        assertFalse(cityList.hasCity(edmonton));
        assertTrue(cityList.hasCity(calgary));
    }

    // 3️⃣ countCities() test
    @Test
    public void testCountCities() {
        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");

        cityList.addCity(edmonton);
        cityList.addCity(calgary);

        assertEquals(2, cityList.countCities());

        cityList.deleteCity(edmonton);

        assertEquals(1, cityList.countCities());
    }
}
