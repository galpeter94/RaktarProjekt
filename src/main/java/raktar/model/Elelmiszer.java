package raktar.model;

import java.time.LocalDateTime;

abstract class Elelmiszer implements Comparable<Elelmiszer> {

    String name;
    String manufacturer;
    LocalDateTime expiry;

    public Elelmiszer(String name, String manufacturer, LocalDateTime expiry){
        if (expiry==null){
            this.expiry = LocalDateTime.now().plusYears(1);
        } else if (!expiry.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Lejárt élelmiszer!");
        } else{
            this.expiry = expiry;
        }
    }

    public int compareToName(Elelmiszer other) {
        return this.name.compareTo(other.name);
    }

    public int compareToManuf(Elelmiszer other){
        return this.manufacturer.compareTo(other.manufacturer);
    }

}
