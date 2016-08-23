package io.egen2.springrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table

@NamedQueries({ 
	@NamedQuery(name = "Movie.findAll", query = "SELECT e FROM Movie e"),
	@NamedQuery(name = "Movie.findByTitle", query = "SELECT e FROM Movie e WHERE e.Title=:pTitle") 
})

public class Movie {
	
	
	@Id
	@GenericGenerator(name = "ID", strategy = "uuid2")
	@GeneratedValue(generator = "ID")
	private String id;
	
	
	@Column(unique = true)
	private String Title;
	
	private String Year;
	
	private String Rated;
	
	private String Released;
	
	private String Runtime;
	
	private String Genere;
	
	private String Director;
	
	private String Writer;
	
	private String Actors;
	
	private String Plot;
	
	private String Language;
	
	private String Country;
	
	private String Awards;
	
	private String Poster;
	
	private String Metascore;
	
	private String imdbRating;
	
	private String imdbVotes;
	
	private String imdbID;
	
	private String Type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getRated() {
		return Rated;
	}

	public void setRated(String rated) {
		Rated = rated;
	}

	public String getReleased() {
		return Released;
	}

	public void setReleased(String released) {
		Released = released;
	}

	public String getRuntime() {
		return Runtime;
	}

	public void setRuntime(String runtime) {
		Runtime = runtime;
	}

	public String getGenere() {
		return Genere;
	}

	public void setGenere(String genere) {
		Genere = genere;
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

	public String getActors() {
		return Actors;
	}

	public void setActors(String actors) {
		Actors = actors;
	}

	public String getPlot() {
		return Plot;
	}

	public void setPlot(String plot) {
		Plot = plot;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getAwards() {
		return Awards;
	}

	public void setAwards(String awards) {
		Awards = awards;
	}

	public String getPoster() {
		return Poster;
	}

	public void setPoster(String poster) {
		Poster = poster;
	}

	public String getMetascore() {
		return Metascore;
	}

	public void setMetascore(String metascore) {
		Metascore = metascore;
	}

	public String getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getImdbVotes() {
		return imdbVotes;
	}

	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", Title=" + Title + ", Year=" + Year + ", Rated=" + Rated + ", Released=" + Released
				+ ", Runtime=" + Runtime + ", Genere=" + Genere + ", Director=" + Director + ", Writer=" + Writer
				+ ", Actors=" + Actors + ", Plot=" + Plot + ", Language=" + Language + ", Country=" + Country
				+ ", Awards=" + Awards + ", Poster=" + Poster + ", Metascore=" + Metascore + ", imdbRating="
				+ imdbRating + ", imdbVotes=" + imdbVotes + ", imdbID=" + imdbID + ", Type=" + Type + "]";
	}
	
	
	

}
