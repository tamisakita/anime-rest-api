package mangaproject.anime.rest.api.application.presentation.representation.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum genreTypeRepresentation {

    ACTION("Action"),
    ADVENTURE("Adventure");

    private final String type;
}
