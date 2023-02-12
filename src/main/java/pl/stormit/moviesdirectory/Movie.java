package pl.stormit.moviesdirectory;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class Movie {
    private String name;
    private UUID id; // UUID - losowy ciąg znaków, trudniej go zgadnąć, bezpieczniejszy niż int

    public Movie() {
        id = UUID.randomUUID();  // wygeneruje id
    }

    public Movie(String name) {
        this();
        this.name = name;
    }
}
