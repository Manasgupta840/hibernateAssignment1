package com.hibernateAssignment1.MovieCustomer;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.DAO.MovieDAO;
import com.hibernate.assignment1.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Scanner sc = new Scanner(System.in);
//    	System.out.println("Project Started....");
//    	System.out.print("Enter the MovieId: ");
//    	String movieId = sc.nextLine();
//    	System.out.print("MovieName: ");
//    	String movieName = sc.nextLine();
//    	System.out.print("Enter the Movie language: ");
//    	String language = sc.nextLine();
//    	System.out.println("Enter the Released Year: ");
//    	Integer releasedyear = sc.nextInt();
//    	System.out.println("Enter the Revenue In Dollars: ");
//    	Integer revenue = sc.nextInt();
//    	Movie movie1 = new Movie(movieId,movieName,language,releasedyear,revenue);
//    	System.out.println("Running");
//    	MovieDAO mov = new MovieDAO();
//    	System.out.println("wait");
    	Movie movie1 = new Movie();
    	movie1.setMovieID("123");
    	movie1.setMovieName("3idiots");
    	movie1.setLanguage("hindi");
    	movie1.setReleasedIn(122);
    	movie1.setRevenueInDollars(20000);
    	System.out.println(movie1);
    	MovieDAO mov = new MovieDAO();
    	mov.addMovie(movie1);
//    	System.out.println("Enter 1 for addDetails");
//    	System.out.println("Enter 2 for delete particular Movie Id details");
//    	System.out.println("Enter 3 for update the details ");
//    	System.out.println("Enter 4 for get the details");
//    	System.out.println("Enter the no.: ");
//    	
//    	int num = sc.nextInt();
//    	
//    	switch(num) {
//    	case 1:
//    	{
//    		addMovie()
//    	}
//    		
//    	}
    	
        
    }
}
