package mangaproject.anime.rest.api.domain.service;

import lombok.extern.slf4j.Slf4j;
import mangaproject.anime.rest.api.domain.domain.Anime;
import mangaproject.anime.rest.api.domain.port.AnimeRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class AnimeService {

    private final AnimeRepositoryPort animeRepositoryPort;

    public AnimeService(AnimeRepositoryPort animeRepositoryPort) {
        this.animeRepositoryPort = animeRepositoryPort;
    }

    public Anime save(Anime anime) {
        try {
            return this.animeRepositoryPort.save(anime);
        } catch (Exception e) {
            log.error("Error when trying to save an anime.", anime, e);
            throw e;
        }
    }

    public List<Anime> searchAnime() {
        try {
            return this.animeRepositoryPort.searchAnime();
        } catch (Exception e) {
            log.error("The anime doesn't exist", e);
            throw e;
        }
    }

}
