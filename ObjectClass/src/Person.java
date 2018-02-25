
public class Person {
	private int age;
	private String fullName;
	private Address address;

	public Person(int age, String fullName, Address address) {
		this.age = age;
		this.fullName = fullName;
		this.address = address;

	
	}

	public int getAge() {
		return age;
	}

	public String getFullName() {
		return fullName;
	}

	public Address getAddress() {
		return address;
	}

	public String printDetails() {
		return fullName + "'s age is " + age + ", fullName: " + fullName + ", address: " + address.toString();
	}
	
}
