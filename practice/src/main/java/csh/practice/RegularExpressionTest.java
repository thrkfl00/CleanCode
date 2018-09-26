package csh.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {
	private static Customer customer = new Customer("Name");;
	private static Movie movie;
	private static Rental rental;

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		AddRental("A", Movie.CHILDRENS, 1);
		AddRental("B", Movie.NEW_RELEASE, 2);
		AddRental("C", Movie.REGULAR, 3);

		String regEx = "[0-9].[0-9]";
		System.out.println(customer.statement());
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(customer.statement());

	}

	private static void AddRental(String MovieName, int priceCode, int daysRented) {
		movie = new Movie("MovieName", Movie.CHILDRENS);
		rental = new Rental(movie, 0);
		customer.addRental(rental);
	}
}
