package p1;

public class Demo {

	public Demo() {
		
	}

	public static void main(String[] args) {
		
		StudentRecords sr = new StudentRecords();
		sr.addNewStudentTemp();
		sr.addNewStudentTemp();
		sr.addNewStudentTemp();
		sr.addNewStudentTemp();
		sr.displayStudentById(1);
		sr.displayStudentById(8);
		//sr.displayStudentByCity("X");
		//sr.displayAllStudentsSortedByName();
	}

}
