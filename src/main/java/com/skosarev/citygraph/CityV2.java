package com.skosarev.citygraph;

import java.util.ArrayList;
import java.util.List;

public class CityV2 {
    String name;
    List<CityRelation> relations = new ArrayList<>();

    public record CityRelation(int price, CityV2 city) {
    }

    public CityV2(String name) {
        this.name = name;
    }

    public CityV2(String name, List<CityRelation> relations) {
        this.relations = relations;
        this.name = name;
    }

    public void addRelation(CityV2 city, int price) {
        CityRelation relation = new CityRelation(price, city);
        relations.add(relation);
    }

    public void addSymmetricRelation(CityV2 city, int price) {
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
