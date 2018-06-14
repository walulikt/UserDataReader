import java.time.LocalDate;

public class User {
	private String firstname;
	private String lastname;
	private LocalDate birthDate;
	private String phoneNumber;
	
	public User(String firstname, String lastname, LocalDate birthDate, String phoneNumber) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

}
