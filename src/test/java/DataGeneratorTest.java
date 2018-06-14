import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DataGeneratorTest {

	@Test
	public void findOldestWithPhoneNumberTest() {
		//Given
		DataGenerator dG = new DataGenerator();
		List<User> usersList = new ArrayList<>();
		DataReader dr = new DataReader();
		String userData1 = "Jan,Kowalski,1980-01-02,123456789";
		String userData2 = "S³awomir,Smutny,1950-08-16,";
		User user1=dr.stringSpliter(userData1);
		User user2=dr.stringSpliter(userData2);
		usersList.add(user1);
		usersList.add(user2);
		
		//When
		User oldestUser = dG.findOldestWithPhoneNumber(usersList, LocalDate.now());
		
		//Then
		assertEquals("Jan", oldestUser.getFirstname());
		assertEquals("Kowalski", oldestUser.getLastname());
		assertEquals(LocalDate.of(1980, 01, 02),oldestUser.getBirthDate());
		assertEquals("123-456-789", oldestUser.getPhoneNumber());
	}
	
	@Test
	public void printInfoTest() {
		//Given
		DataGenerator dG = new DataGenerator();
		DataReader dr = new DataReader();
		String userData1 = "Jan,Kowalski,1980-01-02,123456789";
		String userData2 = "S³awomir,Smutny,1950-08-16,";
		User user1=dr.stringSpliter(userData1);
		User user2=dr.stringSpliter(userData2);
		dG.getUsersList().add(user1);
		dG.getUsersList().add(user2);
		
		//When
		//Then
		dG.printInfo();
		
	}

}
