package com.inheritance;

public class A {

	private void stud_Name() {
		System.out.println("Student Name Is Sudhakar");
		
	}
	protected void stud_Age() {
		System.out.println("Age Of The Student Is 25");

		
	}
	 public void stud_Location() {
		System.out.println("Location is Dindigul");
	}
	public static void main(String[] args) {
		System.out.println("STUDENT DETAILS...");
		
		A obj3 = new A();
		obj3.stud_Name();
		obj3.stud_Age();
		obj3.stud_Location();
		
	}
}


