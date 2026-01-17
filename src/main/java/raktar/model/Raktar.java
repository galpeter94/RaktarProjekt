package raktar.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Raktar implements Iterable<Elelmiszer>, Serializable {
    private static final long serialVersionUID = 1L;
    private final List<Elelmiszer> elelmiszerek = new ArrayList<>();


    public void add(Elelmiszer e) {
        elelmiszerek.add(e);
    }

    @Override
    public Iterator<Elelmiszer> iterator() {
        return elelmiszerek.iterator();
    }
}
