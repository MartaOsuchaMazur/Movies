package pl.stormit.moviesdirectory;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;
import java.util.UUID;
@Getter
@Setter
@Entity
public class Movie {

    private String name;
    @Id
    private UUID id; // UUID - losowy ciąg znaków, trudniej go zgadnąć, bezpieczniejszy niż int

    @ManyToOne
    private Category category;

    @ManyToMany
    private Set<Actor>actors;

    public Movie() {
        id = UUID.randomUUID();  // wygeneruje id
    }

    public Movie(String name) {
        this();
        this.name = name;
    }
}
