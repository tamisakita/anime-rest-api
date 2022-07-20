package mangaproject.anime.rest.api.application.presentation.representation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import mangaproject.anime.rest.api.application.presentation.representation.enums.genreTypeRepresentation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "anime")
public class AnimeResponseRepresentation {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("author")
    private String author;

    @JsonProperty("yerPublication")
    private Integer yearPublication;

    @JsonProperty("episodesNumber")
    private Integer episodesNumber;

    @JsonProperty("genre")
    private genreTypeRepresentation genre;

    @JsonProperty("synopsis")
    private String synopsis;

}
