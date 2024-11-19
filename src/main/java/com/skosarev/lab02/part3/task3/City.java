package com.skosarev.lab02.part3.task3;

import java.util.ArrayList;
import java.util.List;

public class City {
    String name;
    List<CityRelation> relations = new ArrayList<>();

    record CityRelation(int price, City city) {
    }

    public City(String name) {
        this.name = name;
    }

    public void addRelation(City city, int price) {
        CityRelation relation = new CityRelation(price, city);
        relations.add(relation);
    }

    public void addSymmetricRelation(City city, int price) {
        city.addRelation(this, price);
        addRelation(city, price);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Город: ").append(name).append("\n");
        relations.forEach(r -> sb.append(r.city.name).append(":").append(r.price).append("\n"));
        return sb.toString();
    }
}
