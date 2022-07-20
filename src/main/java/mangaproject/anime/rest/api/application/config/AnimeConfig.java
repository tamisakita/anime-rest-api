package mangaproject.anime.rest.api.application.config;

import mangaproject.anime.rest.api.domain.port.AnimeRepositoryPort;
import mangaproject.anime.rest.api.domain.service.AnimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimeConfig {

    @Bean
    public AnimeService animeService(AnimeRepositoryPort animeRepositoryPort) {
        return new AnimeService(animeRepositoryPort);
    }

}
