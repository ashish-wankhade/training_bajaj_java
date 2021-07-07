package day3;

public class Student {
	String name;
	int age;
	boolean isEligible;
	
	static String CLLG_NAME = "ABC";
		
		public Student() {} //empty constructor
	
		public Student(String name, int age, boolean isEligible) {
			this.name = name;
			this.age = age;
			this.isEligible = isEligible;
		}
		
		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		public void isEligible() {
			if(isEligible) {
				System.out.println("Student is Eligible");
			}
			else {
				System.out.println("Student isn't Eligible");
			}
		}
		
		public static void Display() {
			System.out.println("Displaying Students");
		}

}
