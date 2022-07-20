package mangaproject.anime.rest.api.domain.port;

import mangaproject.anime.rest.api.domain.domain.Anime;

import java.util.List;

public interface AnimeRepositoryPort {

    Anime save(Anime anime);

    List<Anime> searchAnime();

}
