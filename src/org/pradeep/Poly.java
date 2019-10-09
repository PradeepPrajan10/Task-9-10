package org.pradeep;

import org.seleniumhq.jetty9.util.Scanner;

public class Poly {
	
	public void EmpName(String Name) {
		System.out.println("name is " + Name);
	}
	public void EmpId(int id) {
		System.out.println("id is"+ id);
	}
	public void EmpAdd(String Add, int pin) {
		System.out.println(Add);
		System.out.println(pin);
	}
	private void EmpLocation(String Location) {
		System.out.println(Location);
	}
public static void main(String[] args) {
	Poly a = new Poly();
	a.EmpName("pradeep");
	a.EmpAdd("Chennai", 17);
	a.EmpLocation("anna nagar");
	a.EmpId(01);
	
}
}
