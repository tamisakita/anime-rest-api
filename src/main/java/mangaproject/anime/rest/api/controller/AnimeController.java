package mangaproject.anime.rest.api.controller;

import mangaproject.anime.rest.api.model.AnimeModel;
import mangaproject.anime.rest.api.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnimeController {

    @Autowired
    private AnimeRepository repository;

    @GetMapping(path = "/api/anime/{code}")
    public ResponseEntity consult(@PathVariable("code") Integer code) {
        return repository.findById(code)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/anime/save")
    public AnimeModel save(@RequestBody AnimeModel anime) {
        return repository.save(anime);
    }
}
