package mangaproject.anime.rest.api.application.presentation.controller;

import mangaproject.anime.rest.api.application.mapper.AnimeMapper;
import mangaproject.anime.rest.api.application.presentation.representation.AnimeRequestRepresentation;
import mangaproject.anime.rest.api.application.presentation.representation.AnimeResponseRepresentation;
import mangaproject.anime.rest.api.application.repository.jpa.entity.AnimeEntity;
import mangaproject.anime.rest.api.domain.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Objects.nonNull;

@RestController
@RequestMapping(value = "/v1/anime-rest-api")
public class AnimeController {

    @Autowired
    private final AnimeService animeService;

    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @PostMapping(path = "/api/anime/save")
    public ResponseEntity<AnimeResponseRepresentation> save(@RequestBody AnimeRequestRepresentation body) {
        var anime = animeService.save(AnimeMapper.toDomain(body));
        if (nonNull(anime)) {
            return ResponseEntity.status(HttpStatus.CREATED).body(AnimeMapper.toRepresentation(anime));
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping(path = "/api/anime")
    public ResponseEntity<List<AnimeResponseRepresentation>> searchAnime() {
        var animeList = animeService.searchAnime();
        //convertendo o list do domain para representation
        var representationList = AnimeMapper.toAnimeResponseRepresentationList(animeList);
        return ResponseEntity.ok(representationList);
    }

}
