package raktar.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Raktar implements Iterable<Elelmiszer> {

    private final List<Elelmiszer> elelmiszerek = new ArrayList<>();


    @Override
    public Iterator<Elelmiszer> iterator() {
        return elelmiszerek.iterator();
    }
}
