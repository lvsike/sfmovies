package com.example.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Author: <a href="mailto:lsk2008@msn.com">sike,lv</a>
 * Date: 16-12-8 上午6:33
 */
@Entity
@Table(name = "sf_movies")
public class SFMovies implements Serializable {

    private static final long serialVersionUID = 1507749866377666291L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String releaseYear;
    private String locations;
    private String funFacts;
    private String productionCompany;
    private String distributor;
    private String director;
    private String writer;
    private String actor1;
    private String actor2;
    private String actor3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getFunFacts() {
        return funFacts;
    }

    public void setFunFacts(String funFacts) {
        this.funFacts = funFacts;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActor1() {
        return actor1;
    }

    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    public String getActor3() {
        return actor3;
    }

    public void setActor3(String actor3) {
        this.actor3 = actor3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SFMovies)) return false;

        SFMovies sfMovies = (SFMovies) o;

        if (actor1 != null ? !actor1.equals(sfMovies.actor1) : sfMovies.actor1 != null) return false;
        if (actor2 != null ? !actor2.equals(sfMovies.actor2) : sfMovies.actor2 != null) return false;
        if (actor3 != null ? !actor3.equals(sfMovies.actor3) : sfMovies.actor3 != null) return false;
        if (director != null ? !director.equals(sfMovies.director) : sfMovies.director != null) return false;
        if (distributor != null ? !distributor.equals(sfMovies.distributor) : sfMovies.distributor != null)
            return false;
        if (funFacts != null ? !funFacts.equals(sfMovies.funFacts) : sfMovies.funFacts != null) return false;
        if (!id.equals(sfMovies.id)) return false;
        if (locations != null ? !locations.equals(sfMovies.locations) : sfMovies.locations != null) return false;
        if (productionCompany != null ? !productionCompany.equals(sfMovies.productionCompany) : sfMovies.productionCompany != null)
            return false;
        if (releaseYear != null ? !releaseYear.equals(sfMovies.releaseYear) : sfMovies.releaseYear != null)
            return false;
        if (title != null ? !title.equals(sfMovies.title) : sfMovies.title != null) return false;
        if (writer != null ? !writer.equals(sfMovies.writer) : sfMovies.writer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (releaseYear != null ? releaseYear.hashCode() : 0);
        result = 31 * result + (locations != null ? locations.hashCode() : 0);
        result = 31 * result + (funFacts != null ? funFacts.hashCode() : 0);
        result = 31 * result + (productionCompany != null ? productionCompany.hashCode() : 0);
        result = 31 * result + (distributor != null ? distributor.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (writer != null ? writer.hashCode() : 0);
        result = 31 * result + (actor1 != null ? actor1.hashCode() : 0);
        result = 31 * result + (actor2 != null ? actor2.hashCode() : 0);
        result = 31 * result + (actor3 != null ? actor3.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SFMovies{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", locations='" + locations + '\'' +
                ", funFacts='" + funFacts + '\'' +
                ", productionCompany='" + productionCompany + '\'' +
                ", distributor='" + distributor + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", actor1='" + actor1 + '\'' +
                ", actor2='" + actor2 + '\'' +
                ", actor3='" + actor3 + '\'' +
                '}';
    }
}
