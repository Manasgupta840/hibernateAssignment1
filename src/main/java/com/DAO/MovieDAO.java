package com.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.assignment1.Movie;
import com.session.ConnectionBuilder;


public class MovieDAO {
	
	
	public MovieDAO() {
		
		// TODO Auto-generated constructor stub
	}
	
		public String addMovie(Movie movie) {
			
			Session session = ConnectionBuilder.getSession();
			session.beginTransaction();
			session.save(movie);
			session.getTransaction().commit();
			session.close();
			return movie.getMovieID();
		
		}
	
		public void deleteMovie(String movieId) {
			Session session = ConnectionBuilder.getSession();
			session.beginTransaction();
			session.delete(movieId);
			session.getTransaction().commit();
			session.close();
		}
		
		public void updateMovie(String movieId) {
			Session session = ConnectionBuilder.getSession();
			session.beginTransaction();
			Movie m1 = session.get(Movie.class, movieId);
			m1.setRevenueInDollars(m1.getReleasedIn()+100000);
			session.update(m1);
			session.getTransaction().commit();
			session.close();
		}
		public Movie getMovieDetails(String movieId) {
			Session session = ConnectionBuilder.getSession();
			session.beginTransaction();
			Movie m1 = session.get(Movie.class, movieId);
			session.getTransaction().commit();
			session.close();
			return m1;
		}
	
}
