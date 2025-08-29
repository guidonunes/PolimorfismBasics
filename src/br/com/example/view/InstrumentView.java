package br.com.example.view;

import java.util.ArrayList;

import br.com.example.model.Instrument;
import br.com.example.model.Drum;
import br.com.example.model.Guitar;


public class InstrumentView {

    public static void main(String[] args) {
        var products = new ArrayList<Instrument>();
        products.add(new Drum("HD-1", "Roland", 7));
        products.add(new Guitar("T-506C", "Tagima", "Mapple"));
        products.add(new Drum("Premium", "Pinguim", 5));

        for (var product : products) {
            System.out.println("The product: " + product + " Shipping method: " + product.getShippingMethod());
        }

    }
}
