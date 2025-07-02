package cmsc_203_Assignment_2_Package;

public class Patient {

	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String emergencyContactName;
	private String emergencyContactPhone;
	
	
	public Patient() {
		firstName="";
		middleName="";
		lastName="";
		streetAddress="";
		city="";
		state="";
		zip="";
		phone="";
		emergencyContactName="";
		emergencyContactPhone="";
		
	}
	
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
	}
	
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zip, String phone, String emergencyContactName, String emergencyContactPhone) {
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		this.streetAddress=streetAddress;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phone=phone;
		this.emergencyContactName=emergencyContactName;
		this.emergencyContactPhone=emergencyContactPhone;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	
	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName=middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress=streetAddress;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public void setState(String state) {
		this.state=state;
	}
	
	public void setZip(String zip) {
		this.zip=zip;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName=emergencyContactName;
	}
	
	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone=emergencyContactPhone;
	}
	
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	public String buildAddress() {
		return streetAddress + ", " + city + ", " + state + " " + zip;
	}
	
	public String buildEmergencyContact() {
		return emergencyContactName + " - " + emergencyContactPhone ;
	}
	
	public String toString() {
		return "Name: " + buildFullName() + 
				"\nAddress: " + buildAddress() + 
				"\nPhone: "	+ phone + 
				"\nEmergencyContact: " + buildEmergencyContact(); 
	}

}