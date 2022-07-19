package mangaproject.anime.rest.api.application.mapper;

import lombok.experimental.UtilityClass;
import mangaproject.anime.rest.api.application.presentation.representation.AnimeRequestRepresentation;
import mangaproject.anime.rest.api.application.presentation.representation.AnimeResponseRepresentation;
import mangaproject.anime.rest.api.application.repository.jpa.entity.AnimeEntity;
import mangaproject.anime.rest.api.domain.domain.Anime;
import org.modelmapper.ModelMapper;

import java.util.function.Supplier;

@UtilityClass
public class AnimeMapper {

    private Supplier<ModelMapper> modelMapperSupplier = ModelMapper::new;


    public Anime toDomain(AnimeRequestRepresentation representation) {
        return modelMapperSupplier.get().map(representation, Anime.class);
    }

    public AnimeResponseRepresentation toRepresentation(Anime anime){
        return modelMapperSupplier.get().map(anime, AnimeResponseRepresentation.class);
    }

    public AnimeEntity toEntity(Anime anime) {
        return modelMapperSupplier.get().map(anime, AnimeEntity.class);
    }

    public Anime entityToDomain(AnimeEntity entity) {
        return modelMapperSupplier.get().map(entity, Anime.class);
    }

}
