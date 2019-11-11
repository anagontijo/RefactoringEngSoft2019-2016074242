import junit.framework.*;
import java.util.Vector;

public class RentalTest extends TestCase{

	public void test_statement() {
		Movie star_wars = new Movie("Star Wars", Movie.REGULAR);
		Movie driver = new Movie("Driver", Movie.REGULAR);
		Movie pulp_fiction = new Movie("Pulp Fiction", Movie.REGULAR);
		Movie euveh = new Movie("Era Uma Vez em Hollywood", Movie.NEW_RELEASE);

		Rental rent_driver = new Rental(driver, 3);
		Rental rent_pulp_fiction = new Rental(pulp_fiction, 2);
		Rental rent_euveh = new Rental(euveh, 1);
    Rental rent_euveh_2 = new Rental(euveh, 2);
    Rental rent_star_wars = new Rental(star_wars, 3);

		Vector rentals = new Vector();
		Customer me = new Customer("Ana");

		me.addRental(rent_driver);
		me.addRental(rent_pulp_fiction);
		me.addRental(rent_euveh);
    me.addRental(rent_star_wars);
    me.addRental(rent_euveh_2);

		String expected_statement = "Rental Record for Ana \n\tDriver\t3\n\tPulp Fiction\t2\n\tEra Uma Vez em Hollywood\t1\n\tStar Wars\t2\n\tEra Uma Vez em Hollywood\t3\nAmount owed is 22.5\nYou earned 5 frequent renter points";
		String customer_statement = customer.statement();
		assertEquals(expected_statement, customer_statement);
	}
}
