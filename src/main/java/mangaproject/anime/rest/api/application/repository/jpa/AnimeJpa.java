package mangaproject.anime.rest.api.application.repository.jpa;

import mangaproject.anime.rest.api.application.repository.jpa.entity.AnimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeJpa extends JpaRepository<AnimeEntity, Long> {}
