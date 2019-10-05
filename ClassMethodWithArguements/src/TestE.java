
public class TestE {
public static void main(String[] args) {
	Employee  employee  = new Employee();
	
	employee.setEmpNum(1001);
	
	employee.setEmpName("NRIT1");

	employee.setEmpSalary(5000);
	
	employee.setEmpDept("dev");
	
	employee.display();
	
	employee.setEmpName("NRIT2");
	
	employee.setEmpDept("Admin");
	
	employee.display();		
	
	employee.setEmpSalary(7000);
	
	employee.display();		

}
}
