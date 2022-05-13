package com.hibernate.assignment1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movie_Details")
public class Movie {
	@Id
	private String movieID;
	@Column
	private String movieName;
	@Column
	private String language;
	@Column
	private Integer releasedIn;
	@Column
	private Integer revenueInDollars;
	
	public Movie() {
		super();
	}
	
	@Override
	public String toString() {
		return "Movie [movieID=" + movieID + ", movieName=" + movieName + ", language=" + language + ", releasedIn="
				+ releasedIn + ", revenueInDollars=" + revenueInDollars + "]";
	}

	public Movie(String movieID, String movieName, String language, Integer releasedIn, Integer revenueInDollars) {
		super();
		this.movieID = movieID;
		this.movieName = movieName;
		this.language = language;
		this.releasedIn = releasedIn;
		this.revenueInDollars = revenueInDollars;
	}
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Integer getReleasedIn() {
		return releasedIn;
	}
	public void setReleasedIn(Integer releasedIn) {
		this.releasedIn = releasedIn;
	}
	public Integer getRevenueInDollars() {
		return revenueInDollars;
	}
	public void setRevenueInDollars(Integer revenueInDollars) {
		this.revenueInDollars = revenueInDollars;
	}
	
	
	
}
