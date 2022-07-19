package mangaproject.anime.rest.api.domain.domain;

import lombok.*;
import mangaproject.anime.rest.api.domain.enums.genreType;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Anime {

    private Long id;
    private String name;
    private String author;
    private Integer yearPublication;
    private Integer episodesNumber;
    private genreType genre;
    private String synopsis;

}

