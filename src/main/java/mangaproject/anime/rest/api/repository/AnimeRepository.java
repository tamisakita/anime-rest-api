package mangaproject.anime.rest.api.repository;

import mangaproject.anime.rest.api.model.AnimeModel;
import org.springframework.data.repository.CrudRepository;

public interface AnimeRepository extends CrudRepository<AnimeModel, Integer> {


}
