package com.example.lab08;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class CustomListTest {
//failing test
    private CustomList cityList;

    @Before
    public void setUp() {
        cityList = new CustomList();
    }

    @Test
    public void testHasCity() {
        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");

        cityList.addCity(edmonton);

        // Expect true for city that was added
        assertTrue(cityList.hasCity(edmonton));

        // Expect false for city that was not added
        assertFalse(cityList.hasCity(calgary));
    }
}
