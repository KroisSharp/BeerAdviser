package mik.easj.skole.beeradviser;


import java.util.ArrayList;
import java.util.List;


public class BeerExpert {

List<String> GetBrands(String colour) {
    List<String> Brands = new ArrayList<String>();
    if (colour.equals("Amber")){
        Brands.add("Jack Amber");
        Brands.add("Red Moose");
    }else {
        Brands.add("Jail Pale Ale");
        Brands.add("Gout Stout");
    }
    return Brands;
}


}
