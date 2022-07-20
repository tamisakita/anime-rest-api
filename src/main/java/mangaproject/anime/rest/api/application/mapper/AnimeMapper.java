package mangaproject.anime.rest.api.application.mapper;

import lombok.experimental.UtilityClass;
import mangaproject.anime.rest.api.application.presentation.representation.AnimeRequestRepresentation;
import mangaproject.anime.rest.api.application.presentation.representation.AnimeResponseRepresentation;
import mangaproject.anime.rest.api.application.repository.jpa.entity.AnimeEntity;
import mangaproject.anime.rest.api.domain.domain.Anime;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@UtilityClass
public class AnimeMapper {

    private Supplier<ModelMapper> modelMapperSupplier = ModelMapper::new;


    public Anime toDomain(AnimeRequestRepresentation representation) {
        return modelMapperSupplier.get().map(representation, Anime.class);
    }

    //do domain(service) para representation(espelho do que o usuario recebe de resposta)
    public AnimeResponseRepresentation toRepresentation(Anime anime){
        return modelMapperSupplier.get().map(anime, AnimeResponseRepresentation.class);
    }

    public AnimeEntity toEntity(Anime anime) {
        return modelMapperSupplier.get().map(anime, AnimeEntity.class);
    }

    public Anime entityToDomain(AnimeEntity entity) {
        return modelMapperSupplier.get().map(entity, Anime.class);
    }

    //representation -> domain -> entity
//    public List<Anime> entityListToDomainList(List<AnimeEntity> animeEntityList) {
//        List<Anime> animeList = new ArrayList<>();
//        for (AnimeEntity animeEntity : animeEntityList) {
//            animeList.add(entityToDomain(animeEntity));
//        }
//
//        return animeList;
//    }
//


    // do list<anime> -> Domain para list<animeResponseRepresentation> -> Representation
    public List<AnimeResponseRepresentation> toAnimeResponseRepresentationList(List<Anime> animeList) {
        List<AnimeResponseRepresentation> animeRepresentationList = new ArrayList<>();
        for (Anime anime : animeList) {
            animeRepresentationList.add(toRepresentation(anime));
        }

        return animeRepresentationList;
    }

    public List<Anime> toDomainList(List<AnimeEntity> animeEntityList) {
        List<Anime> animeList = new ArrayList<>();
        for (AnimeEntity animeEntity : animeEntityList) {
            animeList.add(entityToDomain(animeEntity));
        }

        return animeList;
    }
}
