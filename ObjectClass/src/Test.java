
public class Test {
	public static void main(String[] args) {
		Address a = new Address(63, "Karmiel", "Israel");
		Student Elio = new Student(22, "Elio Pikuli", a, 100, "Ort Psagot");
		Student Aviv = new Student(21, "Aviv Nedved", a, 79, "John Bryce");
		
		System.out.println(Elio.printDetails());
		System.out.println(Elio.toString());
		System.out.println(Aviv.printDetails());
		System.out.println(Aviv.toString());
	}
}
