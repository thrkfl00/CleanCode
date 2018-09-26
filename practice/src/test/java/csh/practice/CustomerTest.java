package csh.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {

	private Customer customer = new Customer("customer");;
	private Movie movie;
	private Rental rental;

	@Test
	public void Customer_childerens_add_test() {
		addRental("Movie1", Movie.CHILDRENS, 1);

		assertEquals("Rental Record for customer\r\n" + 
				"	Movie1	1.5\r\n" + 
				"Amount owed is 1.5\r\n" + 
				"You earned 1 frequent renter points", customer.statement());
	}

	private void addRental(String movieName, int priceCode, int daysRented) {
		movie = new Movie(movieName, priceCode);
		rental = new Rental(movie, daysRented);
		customer.addRental(rental);
	}
}
