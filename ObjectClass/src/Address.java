
public class Address {
	private int houseNum;
	private String city;
	private String country;

	public Address(int houseNum, String city, String country) {
		this.houseNum = houseNum;
		this.city = city;
		this.country = country;
	}

	public int getHouseNum() {
		return houseNum;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "houseNum: " + houseNum + ", city: " + city + ", country: " + country;
	}
	
}
