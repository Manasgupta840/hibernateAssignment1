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
    public static void main( String[] args ) throws Exception
    {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Project Started....");
    	
    	
    	System.out.println("Enter 1 for addDetails");
    	System.out.println("Enter 2 for delete particular Movie Id details");
    	System.out.println("Enter 3 for update the details ");
    	System.out.println("Enter 4 for get the details");
    	System.out.println("Enter the no.: ");
    	
    	int num = sc.nextInt();
    	MovieDAO mov = new MovieDAO();
    	
    	switch(num) {
    	case 1:
    		System.out.print("Enter the MovieId: ");
        	String movieId = sc.nextLine();
        	System.out.print("MovieName: ");
        	String movieName = sc.nextLine();
        	System.out.print("Enter the Movie language: ");
        	String language = sc.nextLine();
        	System.out.println("Enter the Released Year: ");
        	Integer releasedyear = sc.nextInt();
        	System.out.println("Enter the Revenue In Dollars: ");
        	Integer revenue = sc.nextInt();
        	System.out.println("Running");
        	
        	System.out.println("wait");
        	Movie movie1 = new Movie();
        	movie1.setMovieID(movieId);
        	movie1.setMovieName(movieName);
        	movie1.setLanguage(language);
        	movie1.setReleasedIn(releasedyear);
        	movie1.setRevenueInDollars(revenue);
        	System.out.println(movie1);
    	
    		mov.addMovie(movie1);
    		System.out.println("details added");
    		break;
    	
    	case 2:
    		System.out.print("Enter the Movie Id for delete it's record: ");
    		String s = sc.next();
    		mov.deleteMovie(s);
    		break;
    	case 3:
    		System.out.print("Enter the Movie Id for update it's record: ");
    		String r = sc.next();
    		mov.updateMovie(r);
    		System.out.println("details updated");
    		break;
    	case 4:
    		System.out.print("Enter the Movie Id for getting it's record: ");
    		String t = sc.next();
    		System.out.println(mov.getMovieDetails(t));
    		break;
    	default:
    		System.out.println("Run the code again and please Enter the correct Number!");
    	}
    	
    	
        
    }
}
