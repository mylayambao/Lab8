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

        list.addCity(new City("Calgary", "AB"));
        assertEquals(1, list.countCities());

    }

    @Test void testDelete(){
        CityList cityList = mockCityList();


        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        Assert.assertEquals(2, cityList.countCities());

        cityList.delete(city);
        Assert.assertEquals(1, cityList.countCities());



    }

}
