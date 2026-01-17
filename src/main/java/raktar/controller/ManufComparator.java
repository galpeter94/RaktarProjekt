package raktar.controller;

import raktar.model.Elelmiszer;

import java.util.Comparator;

public class ManufComparator implements Comparator<Elelmiszer> {

    @Override
    public int compare(Elelmiszer e1, Elelmiszer e2) {
        return e1.getManufacturer().compareToIgnoreCase(e2.getManufacturer());
    }
}
