package hawks.api;

import com.github.javafaker.Faker;

import net.minidev.json.JSONObject;

public class DataGenerator {

	public static String getEmail() {
		Faker faker = new Faker();
		String email = faker.name().firstName().toLowerCase() + faker.name().lastName() + "@test.com";
		return email;
	}

	public static String getPassword() {
		Faker faker = new Faker();
		String password = faker.funnyName().name();
		return password;
	}
	
	public static String getFirstName() {
		Faker faker = new Faker();
		String firstName = faker.name().firstName();
		return firstName;
	}
	
	public static String getTitle() {
		Faker faker = new Faker();
		String title = faker.name().title();
		return title;
	}
	
	public static String getLastName() {
		Faker faker = new Faker();
		String lastName = faker.name().lastName();
		return lastName;
	}
	
	public static String getGender() {
		Faker faker = new Faker();
		String gender = faker.name().bloodGroup();
		return gender;
	}
	
	public static  String getMaritalStatus() {
		Faker faker = new Faker();
		String maritalStatus = faker.relationships().spouse();
		return maritalStatus;	
	}
	 public static JSONObject getValues() {
		 Faker faker = new Faker();
		 String email = faker.name().firstName().toLowerCase() + faker.name().lastName() + "@test.com";
		 String firstName = faker.name().firstName();
		 String lastName = faker.name().lastName();
		 String title = faker.name().title();
		 String gender = faker.demographic().sex();
		 String maritalStatus = faker.demographic().maritalStatus();
		 String employmentStatus = faker.job().position();
		 String dateOfBirth = "1991-02-02";
		 String languagePref = faker.random().toString();
		 String addressType = faker.address().country();
		 String addressLine1 = faker.address().fullAddress();
		 String city = faker.address().city();
		 String state = faker.address().state();
		 String postalCodeString = faker.address().zipCode();
		 String countryCode = faker.address().countryCode();
		 String phoneNumber = faker.phoneNumber().cellPhone();
		 String phoneExtension = faker.phoneNumber().extension();
		 String phoneTime  = faker.address().timeZone();
		 String phoneType = faker.phoneNumber().cellPhone();
			
	     JSONObject json = new JSONObject();
		 json.put("email", email); 
		 json.put("title", title); 
		 json.put("firstName", firstName); 
		 json.put("lastName", lastName); 
		 json.put("gender", gender); 
		 json.put("maritalStatus",maritalStatus); 
		 json.put("employmentStatus", employmentStatus); 
		 json.put("dateOfBirth", dateOfBirth); 
		 json.put("languagePref", languagePref); 
		 json.put("addressType", addressType); 
		 json.put("addressLine1", addressLine1); 
		 json.put("city", city); 
		 json.put("state", state); 
		 json.put("postalCode", postalCodeString); 
		 json.put("countryCode", countryCode); 
		 json.put("phoneNumber", phoneNumber); 
		 json.put("phoneExtension", phoneExtension); 
		 json.put("phoneTime", phoneTime); 
		 json.put("phoneType", phoneType); 
		 
		 return json;
		 
		 
	 }
	
	
	
	

}
