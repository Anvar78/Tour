package admin_user.dto;

public class UserDto {


	private String email;
	private String password;
	private String role;
	private String fullname;
	private String street;
	private String city;
	private String state;
	private String zipCode;
	private String gender;



	public UserDto(String email, String password, String role, String fullname, String street, String city, String state, String zipCode, String gender  ) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
		this.fullname = fullname;
		this.street = street;
		this.city= city;
		this.state = state;
		this.zipCode = zipCode;
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	

}
