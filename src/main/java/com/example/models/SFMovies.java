package com.example.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Author: <a href="mailto:lsk2008@msn.com">lvsike</a>
 * Date: 16-12-8 上午6:33
 */
@Entity
@Table(name = "sf_movies")
public class SFMovies implements Serializable {

    private static final long serialVersionUID = 1507749866377666291L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Title;
    private String ReleaseYear;
    private String Locations;
    private String FunFacts;
    private String ProductionCompany;
    private String Distributor;
    private String Director;
    private String Writer;
    private String Actor1;
    private String Actor2;
    private String Actor3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        ReleaseYear = releaseYear;
    }

    public String getLocations() {
        return Locations;
    }

    public void setLocations(String locations) {
        Locations = locations;
    }

    public String getFunFacts() {
        return FunFacts;
    }

    public void setFunFacts(String funFacts) {
        FunFacts = funFacts;
    }

    public String getProductionCompany() {
        return ProductionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        ProductionCompany = productionCompany;
    }

    public String getDistributor() {
        return Distributor;
    }

    public void setDistributor(String distributor) {
        Distributor = distributor;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    public String getActor1() {
        return Actor1;
    }

    public void setActor1(String actor1) {
        Actor1 = actor1;
    }

    public String getActor2() {
        return Actor2;
    }

    public void setActor2(String actor2) {
        Actor2 = actor2;
    }

    public String getActor3() {
        return Actor3;
    }

    public void setActor3(String actor3) {
        Actor3 = actor3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SFMovies)) return false;

        SFMovies sfMovies = (SFMovies) o;

        if (Actor1 != null ? !Actor1.equals(sfMovies.Actor1) : sfMovies.Actor1 != null) return false;
        if (Actor2 != null ? !Actor2.equals(sfMovies.Actor2) : sfMovies.Actor2 != null) return false;
        if (Actor3 != null ? !Actor3.equals(sfMovies.Actor3) : sfMovies.Actor3 != null) return false;
        if (Director != null ? !Director.equals(sfMovies.Director) : sfMovies.Director != null) return false;
        if (Distributor != null ? !Distributor.equals(sfMovies.Distributor) : sfMovies.Distributor != null)
            return false;
        if (FunFacts != null ? !FunFacts.equals(sfMovies.FunFacts) : sfMovies.FunFacts != null) return false;
        if (Locations != null ? !Locations.equals(sfMovies.Locations) : sfMovies.Locations != null) return false;
        if (ProductionCompany != null ? !ProductionCompany.equals(sfMovies.ProductionCompany) : sfMovies.ProductionCompany != null)
            return false;
        if (ReleaseYear != null ? !ReleaseYear.equals(sfMovies.ReleaseYear) : sfMovies.ReleaseYear != null)
            return false;
        if (Title != null ? !Title.equals(sfMovies.Title) : sfMovies.Title != null) return false;
        if (Writer != null ? !Writer.equals(sfMovies.Writer) : sfMovies.Writer != null) return false;
        if (!id.equals(sfMovies.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (Title != null ? Title.hashCode() : 0);
        result = 31 * result + (ReleaseYear != null ? ReleaseYear.hashCode() : 0);
        result = 31 * result + (Locations != null ? Locations.hashCode() : 0);
        result = 31 * result + (FunFacts != null ? FunFacts.hashCode() : 0);
        result = 31 * result + (ProductionCompany != null ? ProductionCompany.hashCode() : 0);
        result = 31 * result + (Distributor != null ? Distributor.hashCode() : 0);
        result = 31 * result + (Director != null ? Director.hashCode() : 0);
        result = 31 * result + (Writer != null ? Writer.hashCode() : 0);
        result = 31 * result + (Actor1 != null ? Actor1.hashCode() : 0);
        result = 31 * result + (Actor2 != null ? Actor2.hashCode() : 0);
        result = 31 * result + (Actor3 != null ? Actor3.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SFMovies{" +
                "id=" + id +
                ", Title='" + Title + '\'' +
                ", ReleaseYear='" + ReleaseYear + '\'' +
                ", Locations='" + Locations + '\'' +
                ", FunFacts='" + FunFacts + '\'' +
                ", ProductionCompany='" + ProductionCompany + '\'' +
                ", Distributor='" + Distributor + '\'' +
                ", Director='" + Director + '\'' +
                ", Writer='" + Writer + '\'' +
                ", Actor1='" + Actor1 + '\'' +
                ", Actor2='" + Actor2 + '\'' +
                ", Actor3='" + Actor3 + '\'' +
                '}';
    }
}
