package raktar.model;

import java.io.Serializable;
import java.util.*;

public class Raktar implements Iterable<Elelmiszer>, Serializable {
    private static final long serialVersionUID = 1L;
    private final List<Elelmiszer> elelmiszerek = new ArrayList<>();


    public void add(Elelmiszer e) {
        elelmiszerek.add(e);
    }

    public void byName(){
        Collections.sort(elelmiszerek, new NameComparator());
    }

    public void byManuf(){
        Collections.sort(elelmiszerek, new ManufComparator());
    }


    @Override
    public Iterator<Elelmiszer> iterator() {
        return elelmiszerek.iterator();
    }



}

class ManufComparator implements Comparator<Elelmiszer> {

    @Override
    public int compare(Elelmiszer e1, Elelmiszer e2) {
        return e1.getManufacturer().compareToIgnoreCase(e2.getManufacturer());
    }
}

class NameComparator implements Comparator<Elelmiszer> {
    @Override
    public int compare(Elelmiszer e1, Elelmiszer e2) {
        return e1.getName().compareToIgnoreCase(e2.getName());
    }
}
