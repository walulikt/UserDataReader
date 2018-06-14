import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DataGenerator {
	private List<User> usersList = new ArrayList<>();
	private int maxAge=0;
	
	public List<User> getUsersList() {
		return usersList;
	}
	
	public User findOldestWithPhoneNumber(List <User> usersList, LocalDate currentTime) {
		User oldestUser=null;
		
		for(int i=0;i<usersList.size();i++) {
			int age = Period.between(usersList.get(i).getBirthDate(),currentTime).getYears();
			if(age>maxAge && usersList.get(i).getPhoneNumber()!=null) {
				maxAge=age;
				oldestUser=usersList.get(i);
			}
		}
		return oldestUser;
	}
	
	public void printInfo() {
		User theUser = findOldestWithPhoneNumber(usersList, LocalDate.now());
		System.out.println("Iloœæ u¿ytkowników na liœcie: " + usersList.size());
		
		System.out.println("Najstarszy u¿ytkownik z numerem telefonu to: " + theUser.getFirstname()+ " " + theUser.getLastname() +
				" ma lat: "+maxAge + ", numer telefonu: " + theUser.getPhoneNumber());
	}


}
