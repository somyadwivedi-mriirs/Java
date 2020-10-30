package hsbc;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String building="building1";
	private String city="hyderabad";
	private String street="some street";
	
	
	public Address() {
		
	}
	
	public Address(String building, String city, String street) {
		super();
		this.building = building;
		this.city = city;
		this.street = street;
	}

	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [building=" + building + ", city=" + city + ", street=" + street + "]";
	}

	
	

}
