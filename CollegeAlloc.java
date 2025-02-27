
import java.util.Scanner;

public class CollegeAlloc {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Student Name: ");
	String studentName = sc.nextLine();

	System.out.print("Enter College Name: ");
	String collegeName = sc.nextLine();

	System.out.print("Enter Test Rank: ");
	int testRank = sc.nextInt();
	sc.nextLine();

	System.out.print("Enter Date of Joining (DD/MM/YYYY): ");
	String dateOfJoining = sc.nextLine();

	System.out.print("Enter Address: ");
	String address = sc.nextLine();

	System.out.print("Enter University Name: ");
	String universityName = sc.nextLine();

	double cgpa = 0.0;
	boolean isValidCGPA = false;

	while (!isValidCGPA) {
	System.out.print("Enter CGPA (between 0.0 and 10.0): ");
	cgpa = sc.nextDouble();

	if (cgpa >= 0.0 && cgpa <= 10.0) {
	isValidCGPA = true;
	} else {
	System.out.println("Invalid CGPA. Please enter a valid CGPA between 0.0 and 10.0.");
	}
	}

	String selectedBranch = "";

	if (cgpa >= 9.0) {
	selectedBranch = "Computer Science Engineering";
	} else if (cgpa >= 8.0) {
	selectedBranch = "Electronics and Communication Engineering";
	} else if (cgpa >= 7.0) {
	selectedBranch = "Electrical Engineering";
	} else if (cgpa >= 6.0) {
	selectedBranch = "Mechanical Engineering";
	} else {
	selectedBranch = "Civil Engineering";
	}

	System.out.println("\n********** College Allotment Details **********");
	System.out.println("***********************************************");
	System.out.println("Student Name: " + studentName);
	System.out.println("College Name: " + collegeName);
	System.out.println("Test Rank: " + testRank);
	System.out.println("Date of Joining: " + dateOfJoining);
	System.out.println("Address: " + address);
	System.out.println("University Name: " + universityName);
	System.out.println("CGPA: " + cgpa);
	System.out.println("Selected Branch: " + selectedBranch);
	}

	}




