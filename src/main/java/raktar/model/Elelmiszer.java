package raktar.model;

import java.time.LocalDateTime;

abstract class Elelmiszer {

    String name;
    String manufacturer;
    LocalDateTime expiry;

    public Elelmiszer(String name, String manufacturer, LocalDateTime expiry){
        if (expiry==null){
            expiry = LocalDateTime.now();
        }
    }

}
