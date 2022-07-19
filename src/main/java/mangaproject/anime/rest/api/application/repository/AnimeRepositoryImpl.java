package mangaproject.anime.rest.api.application.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mangaproject.anime.rest.api.application.mapper.AnimeMapper;
import mangaproject.anime.rest.api.application.repository.jpa.AnimeJpa;
import mangaproject.anime.rest.api.domain.domain.Anime;
import mangaproject.anime.rest.api.domain.port.AnimeRepositoryPort;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class AnimeRepositoryImpl implements AnimeRepositoryPort {

    private final AnimeJpa animeJpa;

    @Override
    public Anime save(Anime anime) {
        try {
            var animeEntity = animeJpa.save(AnimeMapper.toEntity(anime));
            return AnimeMapper.entityToDomain(animeEntity);
        } catch (Exception e) {
            log.error("Erro ao tentar salvar o anime. {}", anime, e);
            throw e;
        }
    }

//    @Override
//    public Anime getAnimeById(Anime anime) {
//        return anime;
//    }

}
