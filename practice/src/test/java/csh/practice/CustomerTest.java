package csh.practice;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {

    private Customer customer;
	private Movie movie;
	private Rental rental;

	@Test
	public void Customer_childerens_add_test() {
		customer = new Customer("Name");
		movie = new Movie("MovieName", Movie.CHILDRENS);
		rental = new Rental(movie, 0);
		customer.addRental(rental);
			
		
		
		assertEquals("Rental Record for Name\n" + 
				"	MovieName	1.5\n" + 
				"Amount owed is 1.5\n" + 
				"You earned 1 frequent renter points", customer.statement());
	}

	
}
