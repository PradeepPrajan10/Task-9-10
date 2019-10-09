package org.pradeep;

public class Sample4 extends Poly {
	
	@Override
	public void EmpName(String Name) {
		super.EmpName(Name);
	}
	@Override
	public void EmpId(int id) {
		super.EmpId(id);
	}

	public static void main(String[] args) {
		Sample4 x = new Sample4();
		x.EmpId(01);
		x.EmpAdd("chennai", 17);
		
	
		
	}
	
	

}
