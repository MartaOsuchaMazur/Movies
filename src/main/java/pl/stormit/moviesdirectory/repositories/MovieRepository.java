package pl.stormit.moviesdirectory.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.stormit.moviesdirectory.entities.Movie;

import java.util.UUID;
@Repository
public interface MovieRepository extends CrudRepository<Movie, UUID> {
}
