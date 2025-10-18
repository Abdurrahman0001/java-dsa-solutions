package dsa.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {

        /** Create E-Commerce cart:
         *  1) add product
         *  2) remove product
         *  3) Final Cart
         *  4) Total item
         *
         * */
        List<String> cart  = new ArrayList<>();
        cart.add("shoes");
        cart.add("T-shirt");
        cart.add("Laptop");
        cart.add("Bottle");

        cart.remove("Bottle");

        System.out.println("Final cart: "+cart);
        System.out.println("Total items: "+cart.size());
    }
}
