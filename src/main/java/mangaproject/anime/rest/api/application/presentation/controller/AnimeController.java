package mangaproject.anime.rest.api.application.presentation.controller;

import mangaproject.anime.rest.api.application.mapper.AnimeMapper;
import mangaproject.anime.rest.api.application.presentation.representation.AnimeRequestRepresentation;
import mangaproject.anime.rest.api.application.presentation.representation.AnimeResponseRepresentation;
import mangaproject.anime.rest.api.domain.service.AnimeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static java.util.Objects.nonNull;

@RestController
@RequestMapping(value = "/v1/anime-rest-api")
public class AnimeController {

    private final AnimeService animeService;

    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

//    @GetMapping(path = "/api/anime/{id}")
//    public ResponseEntity<AnimeRequestRepresentation> getAnimeById(@PathVariable("id") Long id) {
//        return repository.findById(id)
//                .map(record -> ResponseEntity.ok().body(record))
//                .orElse(ResponseEntity.notFound().build());
//    }

    @PostMapping(path = "/api/anime/save")
    public ResponseEntity<AnimeResponseRepresentation> save(@RequestBody AnimeRequestRepresentation body) {
        var anime = animeService.save(AnimeMapper.toDomain(body));
        if (nonNull(anime)) {
            return ResponseEntity.status(HttpStatus.CREATED).body(AnimeMapper.toRepresentation(anime));
        }
        return ResponseEntity.badRequest().build();
    }
}
