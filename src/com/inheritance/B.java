package com.inheritance;

public class B extends A{

    public void mark_Of_Subject() {
		System.out.println("TAMIL MARK IS 97");
		System.out.println("ENGLISH MARK IS 99");
		System.out.println("MATHS MARK IS 100");
	
    }
public static void main(String[] args) {
	System.out.println("DETAILS OF THE STUDENT....,");
	
	B mark = new B();
	
	
	mark.stud_Age();
	mark.stud_Location();
	mark.mark_Of_Subject();
}

}

