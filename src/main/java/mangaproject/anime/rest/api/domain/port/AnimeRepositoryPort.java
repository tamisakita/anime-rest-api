package mangaproject.anime.rest.api.domain.port;

import mangaproject.anime.rest.api.domain.domain.Anime;

import java.util.List;
import java.util.Optional;

public interface AnimeRepositoryPort {

    Anime save(Anime anime);

    List<Anime> searchAnime();

    Anime searchAnimeById(Long id);

    Anime updateAnime(Long id, Anime anime);

}
