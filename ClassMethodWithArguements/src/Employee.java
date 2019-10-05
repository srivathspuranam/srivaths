
public class Employee {

private  int empNum;
	
	private  String  empName;
	
	private  double empSalary;
	
	private  String empDept;

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println(empNum+"\t"+empName+"\t"+empDept+"\t"+empSalary);
	}

}
	 
