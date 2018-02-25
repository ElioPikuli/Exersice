
public class Student extends Person {
	private int grade;
	private String schoolName;

	public Student(int age, String fullName, Address address, int grade, String schoolName) {
		super(age, fullName, address);
		this.grade = grade;
		this.schoolName = schoolName;
	}

	public int getGrade() {
		return grade;
	}

	public String getSchoolName() {
		return schoolName;
	}

	@Override
	public String toString() {
		return "Student stats: grade: " + grade + ", schoolName: " + schoolName;
	}
	
}
