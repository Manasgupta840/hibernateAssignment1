package com.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.assignment1.Movie;
import com.session.ConnectionBuilder;


public class MovieDAO {
	
	
	public MovieDAO() {
		
		// TODO Auto-generated constructor stub
	}
		
		public String addMovie(Movie movie1) throws Exception {
			try {
				Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		        Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		       
		      
		        Session session = factory.openSession();
				
			session.beginTransaction();
			session.persist(movie1);
			session.getTransaction().commit();
			session.close();
			return movie1.getMovieID();
			}
			catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		public String deleteMovie(String movieId) {
			try {
				Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		        Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		       
		      
		        Session session = factory.openSession();
				
		        session.beginTransaction();
		        Movie m1 = session.load(Movie.class, movieId);
				session.delete(m1);
				session.getTransaction().commit();
				session.close();
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}
			return "Movie Deleted";
		}
		
		public void updateMovie(String movieId) {
			try {
				Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		        Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		       
		      
		        Session session = factory.openSession();
				
		        session.beginTransaction();
				Movie m1 = session.load(Movie.class, movieId);
				System.out.println(m1.getReleasedIn());
				m1.setRevenueInDollars(m1.getReleasedIn()+100000);
				session.update(m1);
				session.getTransaction().commit();
				session.close();
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}
			
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
