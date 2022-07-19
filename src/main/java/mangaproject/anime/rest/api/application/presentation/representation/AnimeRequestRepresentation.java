package mangaproject.anime.rest.api.application.presentation.representation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import mangaproject.anime.rest.api.application.presentation.representation.enums.genreTypeRepresentation;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnimeRequestRepresentation {

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
