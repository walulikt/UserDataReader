import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataReader {
	
	public User stringSpliter(String inputString) {
		User user = null;
		String [] stringArray = inputString.split(",");
		String firstname = stringArray[0];
		String	lastname= stringArray[1];
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate birthDate = LocalDate.parse(stringArray[2], formatter);
			String phoneNumber = null;
		if(stringArray.length>3)
			phoneNumber=stringArray[3].format("%s-%s-%s", stringArray[3].substring(0,3), stringArray[3].substring(3,6),stringArray[3].substring(6,9));
		user = new User(firstname,lastname,birthDate,phoneNumber);
		return user;
	}
}
