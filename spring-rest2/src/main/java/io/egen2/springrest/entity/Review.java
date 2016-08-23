package io.egen2.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Review {
	
	
	
	@Id
	@GenericGenerator(name = "ID", strategy = "uuid2")
	@GeneratedValue(generator = "ID")
	private String id;
	
	private String movieId;
	
	private String rating;
	
	private String comments;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", movieId=" + movieId + ", rating=" + rating + ", comments=" + comments + "]";
	}
	
	
	
	
	
	
}
