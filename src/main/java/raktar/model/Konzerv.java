package raktar.model;

import java.time.LocalDateTime;

public class Konzerv extends Elelmiszer{

    String description;
    String recipe;


    public Konzerv(LocalDateTime expiry) {
        super(expiry);
    }
}
