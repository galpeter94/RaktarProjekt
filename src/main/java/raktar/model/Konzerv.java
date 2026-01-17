package raktar.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Konzerv extends Elelmiszer{

    String description;
    String recipe;


    public Konzerv(String name, String manufacturer, LocalDate expiry) {
        super(name, manufacturer, expiry);
    }

    public boolean receptMutat(){
        return this.recipe != null;
    }


    @Override
    public int compareTo(Elelmiszer o) {
        return 0;
    }
}
