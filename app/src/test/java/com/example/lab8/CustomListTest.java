package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    public CustomList mockCityList(){
        list =  new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = mockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(listSize+1, list.getCount());

    }

    @Test void testCityCount(){
        list = mockCityList();
        Assert.assertEquals(1, list.countCities());

        list.addCity(new City("Calgary", "AB"));
        Assert.assertEquals(1, list.countCities());

    }

}
