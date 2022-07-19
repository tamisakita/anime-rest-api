package mangaproject.anime.rest.api.application.repository.jpa.entity;

import lombok.*;
import mangaproject.anime.rest.api.application.presentation.representation.enums.genreTypeRepresentation;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "anime")
public class AnimeEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false, length = 20)
    private String name;

    @Column(name = "author",nullable = false, length = 20)
    private String author;

    @Column(name = "year_publication")
    private Integer yearPublication;

    @Column(name = "episodes_number")
    private Integer episodesNumber;

    @Enumerated(EnumType.STRING)
    private genreTypeRepresentation genre;

    @Column(name = "synopsis", columnDefinition = "TEXT")
    private String synopsis;

    @Column(name = "insert_date_time")
    private LocalDateTime insertDateTime;

    @Column(name = "update_date_time")
    private LocalDateTime updateDateTime;

    @PrePersist
    public void prePersist() {
        insertDateTime = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        updateDateTime = LocalDateTime.now();
    }

}
