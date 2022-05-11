package org.overloading;

/*Method OverLoading*/

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("The students Id :: " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("The students Id :: " + id + " and Name :: " + name);
	}

	public void getStudentInfo(String email, long PhoneNumber) {
		System.out.println("The student email :: " + email + " and PhoneNumber :: " + PhoneNumber);
	}

	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(467);
		stud.getStudentInfo(789, "Swetha");
		stud.getStudentInfo("abc@gmail.com", 9234194399l);
	}

}
