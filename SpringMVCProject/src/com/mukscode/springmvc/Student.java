package com.mukscode.springmvc;

/*import java.util.ArrayList;
import java.util.LinkedHashMap;*/

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystem;
	
	//commenting this code and all its reference to use properties file approach
	//read operating system from code
	/*private LinkedHashMap<String, String> operatingSystemFromCode;*/
	
	//Commenting below code and all It's reference to use properties file approach
	//read favoriteLanguage option
	/*private ArrayList<String> favoriteLang;*/
	
	//Commenting below code and all it's reference for selecting country option using properties file
	//read country option 
	/*private LinkedHashMap<String, String> countryOptions;*/
	
	public Student() {
		
		
		/*operatingSystemFromCode = new LinkedHashMap<>();
		operatingSystemFromCode.put("MacOS", "MasOS");
		operatingSystemFromCode.put("Windows", "Windows");
		operatingSystemFromCode.put("Linux", "Linux");
		operatingSystemFromCode.put("Ubantu", "Ubantu");*/
		
		/*favoriteLang = new ArrayList<>();
		favoriteLang.add("Java");
		favoriteLang.add("JavaScript");
		favoriteLang.add("C#");
		favoriteLang.add("Python");
		*/
		
		/*//populate country option: used ISO Country code
		countryOptions  = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United State of America");*/
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	/*public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	*/
	/*public ArrayList<String> getFavoriteLang(){
		return favoriteLang;
	}*/
	
	/*public LinkedHashMap<String,String> getOperatingSystemFromCode(){
		return operatingSystemFromCode;
	}*/

}
