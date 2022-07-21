package mangaproject.anime.rest.api.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum genreType {

    ACTION("Action"),
    ADVENTURE("Adventure"),
    ROMANCE("Romance"),
    DRAMA("Drama"),
    FICTION("Fiction");

    private final String type;
}
