package com.pluralsight.streamslambdas.examples;

import com.pluralsight.streamslambdas.House;
import com.pluralsight.streamslambdas.Product;

import java.util.ArrayList;
import java.util.List;

public class City {
    public static void main(String[] args) {
         House myHouse = new House();
         House myWifesHouse = new House();

        myHouse.setBathroom(1);
        myHouse.setRooms(5);
        myWifesHouse.setBathroom(2);
        myWifesHouse.setRooms(3);

        List<House> houses = new ArrayList<>();
        houses.add(myHouse);
        houses.add(myWifesHouse);

        houses.sort((h1, h2) -> h1.getBathroom().compareTo(h2.getBathroom()));

        for (House h : houses) {
            System.out.println(h);
        }

        houses.sort((h1, h2) -> h1.getRooms().compareTo(h2.getRooms()));

        for (House h : houses) {
            System.out.println(h);
        }
    }
}
