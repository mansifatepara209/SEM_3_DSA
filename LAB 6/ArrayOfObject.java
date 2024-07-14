import java.util.*;

class student_Detail {
	int enrollmentno;
	String name;
	int semester;
	int CPI;

	void setdetail() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter enrollmentno : ");
		enrollmentno = sc.nextInt();

		System.out.println("Enter name : ");
		name = sc.next();

		System.out.println("Enter semester : ");
		semester = sc.nextInt();

		System.out.println("Enter CPI : ");
		CPI = sc.nextInt();
	}

	void getdetail() {
		System.out.println(enrollmentno);
		System.out.println(name);
		System.out.println(semester);
		System.out.println(CPI);
	}
}

public class ArrayOfObject {
	public static void main(String[] args) {
		student_Detail[] student = new student_Detail[5];

		for (int i = 0; i < 5; i++) {
			student[i] = new student_Detail();
		}

		for (int i = 0; i < 5; i++) {
			student[i].setdetail();

		}

		for (int i = 0; i < 5; i++) {
			student[i].getdetail();
		}
	}
}
