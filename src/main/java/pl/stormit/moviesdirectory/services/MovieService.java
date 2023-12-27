package pl.stormit.moviesdirectory.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.stormit.moviesdirectory.entities.Movie;
import pl.stormit.moviesdirectory.repositories.MovieRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public Iterable<Movie> getMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovie(UUID id) {
        return movieRepository.findById(id)
                .orElseThrow();
    }

    public Movie createMovie(Movie movie) {
        movie.setId(UUID.randomUUID());
        movie = movieRepository.save(movie);
        return  movie;
    }

    public Movie updateMovie(UUID id, Movie movie) {
        Movie movieDB = movieRepository.findById(id)
                .orElseThrow();
        movieDB.setName(movie.getName());

        movieDB = movieRepository.save(movieDB);
        return movieDB;
    }

    public void deleteMovie(UUID id) {
        movieRepository.deleteById(id);
    }
}
