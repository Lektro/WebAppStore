package be.vdab.services;

import be.vdab.model.LiquorType;
import java.util.ArrayList;
import java.util.List;

public class LiquorService {

    public List getAvailableLiquorBrands(LiquorType type){

        List<String> brands = new ArrayList<>();

        if (type.equals(LiquorType.WINE)){
            brands.add("Adrianna Vineyard");
            brands.add(("J. P. Chenet"));

        } else if (type.equals(LiquorType.WHISKY)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");

        } else if (type.equals(LiquorType.BEER)){
            brands.add("Corona");

        } else if (type.equals(LiquorType.GIN)){
            brands.add("Tanqueray London Dry Gin");
            brands.add("Bombay Sapphire London Dry Gin");

        } else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}
