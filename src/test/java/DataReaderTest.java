
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DataReaderTest {
    
	@Test 
	public void stringSpliterTest() {
		//Given
		DataReader dr = new DataReader();
		String userData1 = "Jan,Kowalski,1980-01-02,123456789";
		String userData2 = "S³awomir,Smutny,1950-08-16,";
		
		//When
		User user1=dr.stringSpliter(userData1);
		User user2=dr.stringSpliter(userData2);
		
		//Then
		assertEquals("Jan", user1.getFirstname());
		assertEquals("Kowalski",user1.getLastname());
		assertEquals(LocalDate.of(1980, 01, 02),user1.getBirthDate());
		assertEquals("123-456-789", user1.getPhoneNumber());
		assertNotNull(user2);
		assertEquals(null,user2.getPhoneNumber());
    }
}

