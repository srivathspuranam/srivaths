package constructorsTest;

public class AutoIntTest {
public static void main(String[] args) {
	
	AutoIntSample employee1= new AutoIntSample();
	employee1.setEmpNum(0);
	employee1.setEmpname("Prerana");
	employee1.setEmpSalary(10000);
	employee1.setEmpGender('F');

	AutoIntSample  employee2  = new AutoIntSample();		
	employee2.setEmpname("Abhiram");
	employee2.setEmpGender('M');
	
	AutoIntSample  employee3  = new AutoIntSample();		
	employee3.setEmpname("Tanay");
	employee3.setEmpGender('M');

	System.out.println(employee1.getEmpname());
	System.out.println(employee2);
	System.out.println(employee3);
}
}
