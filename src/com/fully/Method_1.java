package com.fully;

public class Method_1 implements Fully,Secondary {

	@Override
	public void emp_Name() {
		System.out.println("SUDHAKAR");
	}

	@Override
	public void emp_Id() {
		System.out.println("1316");
	}

	@Override
	public void emp_age() {
		System.out.println("25");
		
	}

	@Override
	public void emp_Native() {
			System.out.println("DINDIGUL");
			
	}
	public static void main(String[] args) {
		System.out.println("***EMPLOYEE DETAILS***");
		
		Method_1 oBj1 = new Method_1();
		oBj1.emp_Name();
		oBj1.emp_age();
		oBj1.emp_Id();
		oBj1.emp_Native();
		oBj1.boy_Name();
		oBj1.boy_Id();
		oBj1.boy_Age();
		oBj1.boy_Native();
	}

	@Override
	public void boy_Name() {
System.out.println("PRAVEEN");		
	}

	@Override
	public void boy_Id() {
System.out.println("123");		
	}

	@Override
	public void boy_Age() {
System.out.println("21");		
	}

	@Override
	public void boy_Native() {
System.out.println("Chennai");		
	}

}
