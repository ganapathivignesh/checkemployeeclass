package com.emp;

public class Employee {
     
	int empid;
	String empname;
	double empsalary;
	int empage;
	int empworkyrs;
	
	
	public Employee() {
		;
		// TODO Auto-generated constructor stub
	}


	public Employee(int empid, String empname, double empsalary, int empage,
			int empworkyrs) {
	
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empage = empage;
		this.empworkyrs = empworkyrs;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.empid;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e=(Employee)obj;
		return this.empid==e.empid;
	}
	
	
	
}
