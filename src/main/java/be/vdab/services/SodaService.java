package be.vdab.services;

import be.vdab.model.LiquorType;
import be.vdab.model.SodaType;

import java.util.ArrayList;
import java.util.List;

public class SodaService {
    public List getAvailableBrands(SodaType type){

        List<String> brands = new ArrayList<>();

        if (type.equals(SodaType.COLA)){
            brands.add("Coca-Cola");
            brands.add(("Pepsi"));
            brands.add(("Dr. Pepper"));

        } else if (type.equals(SodaType.WATER)){
            brands.add("Sparkling Water");
            brands.add("Still Water");

        } else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}
