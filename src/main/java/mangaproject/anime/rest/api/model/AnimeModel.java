package mangaproject.anime.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "anime")
public class AnimeModel {

    @Id
    public Integer code;

    @Column(nullable = false, length = 20)
    public String name;

    @Column(nullable = false, length = 20)
    public String author;

    @Column(nullable = false, length = 10)
    public Integer episodesNumber;

    @Column(nullable = false, length = 10)
    public String genre;

    @Column(nullable = false, length = 50)
    public String synopsis;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getEpisodesNumber() {
        return episodesNumber;
    }

    public void setEpisodesNumber(Integer episodesNumber) {
        this.episodesNumber = episodesNumber;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
