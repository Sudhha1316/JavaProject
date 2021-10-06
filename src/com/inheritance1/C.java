package com.inheritance1;

import com.inheritance.B;

public class C extends B {
			public void extendable() {
			System.out.println("SYSTEM OUTPUT");
			
			}
public static void main(String[] args) {
	System.out.println("HAII");
	
	C obj = new C();
	obj.mark_Of_Subject();
	obj.stud_Location();
	obj.extendable();
}
}
