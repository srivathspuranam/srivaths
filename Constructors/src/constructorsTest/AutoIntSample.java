package constructorsTest;

public class AutoIntSample {

	private int empNum;
	private String empname;
	private double empSalary;
	private char empGender;
	
	private static int counter=1000;

	public AutoIntSample()
	{
		empNum=++counter;//assigning empNum automatically
		empSalary=10000;// default salary for any employee.
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public char getEmpGender() {
		return empGender;
	}

	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}
	public void display()
	{
		System.out.println(empNum+"\t"+empname+"\t"+empSalary+"\t"+empGender);
	}
}
