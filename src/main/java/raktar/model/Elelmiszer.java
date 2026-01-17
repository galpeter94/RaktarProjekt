package raktar.model;

import raktar.controller.ExpiredException;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Elelmiszer implements Serializable {

    String name;
    String manufacturer;
    LocalDate expiry;
    private static final long serialVersionUID = 1L;

    public Elelmiszer(String name, String manufacturer, LocalDate expiry){
        this.name=name;
        this.manufacturer=manufacturer;
        if (expiry==null){
            this.expiry = LocalDate.now().plusYears(1);
        } else if (!expiry.isAfter(LocalDate.now())) {
            throw new ExpiredException();
        } else{
            this.expiry = expiry;
        }
    }

    public String getName() {
        return name;

    }

    public String getManufacturer() {
        return manufacturer;

    }


}

