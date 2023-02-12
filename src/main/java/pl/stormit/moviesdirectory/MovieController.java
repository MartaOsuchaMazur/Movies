package pl.stormit.moviesdirectory;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
//@RequestMapping("time")
@RequestMapping("api/v1/movies")
public class MovieController {

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    private final MovieService movieService;

    @GetMapping
    List<Movie> getMovies() {
        return movieService.getMovies();
    }
// generujemy parametr do id
    @GetMapping("{id}")
    Movie getMovie(@PathVariable UUID id){ // @PathVariable - to, co przyjdzie w adresie powinien przemapować na zmienną id
        return movieService.getMovie(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)  // zmienimy informację na 201 - obiekt utworzono
    Movie createMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }
@PutMapping ("{id}")
    Movie updateMovie(@PathVariable UUID id, @RequestBody Movie movie) {
        return movieService.updateMovie(id, movie);
    }
@DeleteMapping("{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteMovie(@PathVariable UUID id){
        movieService.deleteMovie(id);
    }
}


//CRUD
// C - Create
// POST /movies

// R - read
// GET - /movies
// GET - /movies/{id}

// U - update
// PUT - /movies/{id}

// D - delete
// DELETE - /movies/{id}





//    @GetMapping
//   String time() {
//       return ""+System.currentTimeMillis();
//   }

