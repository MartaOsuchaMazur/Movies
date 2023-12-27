package pl.stormit.moviesdirectory.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.stormit.moviesdirectory.services.MovieService;

@Controller
@RequiredArgsConstructor
@RequestMapping("movies")
public class MovieViewController {

    private final MovieService movieService;

    @GetMapping
    String indexView(Model model){
        model.addAttribute("movies", movieService.getMovies());
        return "index";
    }
}
