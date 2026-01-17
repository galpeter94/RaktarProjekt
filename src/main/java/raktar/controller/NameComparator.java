package raktar.controller;

import raktar.model.Elelmiszer;

import java.util.Comparator;

public  class NameComparator implements Comparator<Elelmiszer> {
    @Override
    public int compare(Elelmiszer e1, Elelmiszer e2) {
        return e1.getName().compareToIgnoreCase(e2.getName());
    }

}
