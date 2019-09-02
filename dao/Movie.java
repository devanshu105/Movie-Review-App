package com.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;

@Entity(name = "m_movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieId;

	@NonNull
	private String movieTitle;

	@NonNull
	private int movieRating;

	@Temporal(TemporalType.DATE)
	private Date releaseDate;

	@NonNull
	private String movieLang;

	@NonNull
	private int movieDuration;

	private int reviewCount;

	@NonNull
	private String movieCategory;

	@NonNull
	private String movieDesc;

	@NonNull
	private String movieActors;

	@NonNull
	private String movieDirector;

	@NonNull
	private String movieProducer;

	@NonNull
	private String moviePoster;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public int getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getMovieLang() {
		return movieLang;
	}

	public void setMovieLang(String movieLang) {
		this.movieLang = movieLang;
	}

	public int getMovieDuration() {
		return movieDuration;
	}

	public void setMovieDuration(int movieDuration) {
		this.movieDuration = movieDuration;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public String getMovieCategory() {
		return movieCategory;
	}

	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}

	public String getMovieDesc() {
		return movieDesc;
	}

	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}

	public String getMovieActors() {
		return movieActors;
	}

	public void setMovieActors(String movieActors) {
		this.movieActors = movieActors;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public String getMovieProducer() {
		return movieProducer;
	}

	public void setMovieProducer(String movieProducer) {
		this.movieProducer = movieProducer;
	}

	public String getMoviePoster() {
		return moviePoster;
	}

	public void setMoviePoster(String moviePoster) {
		this.moviePoster = moviePoster;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", movieRating=" + movieRating
				+ ", releaseDate=" + releaseDate + ", movieLang=" + movieLang + ", movieDuration=" + movieDuration
				+ ", reviewCount=" + reviewCount + ", movieCategory=" + movieCategory + ", movieDesc=" + movieDesc
				+ ", movieActors=" + movieActors + ", movieDirector=" + movieDirector + ", movieProducer="
				+ movieProducer + ", moviePoster=" + moviePoster + "]";
	}

	public Movie(Integer movieId, String movieTitle, int movieRating, Date releaseDate, String movieLang,
			int movieDuration, int reviewCount, String movieCategory, String movieDesc, String movieActors,
			String movieDirector, String movieProducer, String moviePoster) {
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.movieRating = movieRating;
		this.releaseDate = releaseDate;
		this.movieLang = movieLang;
		this.movieDuration = movieDuration;
		this.reviewCount = reviewCount;
		this.movieCategory = movieCategory;
		this.movieDesc = movieDesc;
		this.movieActors = movieActors;
		this.movieDirector = movieDirector;
		this.movieProducer = movieProducer;
		this.moviePoster = moviePoster;
	}

	public Movie() {
		// TODO Auto-generated constructor stub
	}

}
