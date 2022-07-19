package mangaproject.anime.rest.api.domain.port;

import mangaproject.anime.rest.api.domain.domain.Anime;

public interface AnimeRepositoryPort {

    Anime save(Anime anime);

   // Anime getAnimeById();
}
