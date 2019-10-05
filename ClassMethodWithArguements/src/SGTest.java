
public class SGTest {
public static void main(String[] args) {
	
	SGMethods employee1 = new SGMethods();

	employee1.setEmpNum(1001);
	employee1.setEmpName("Abhiram");
	employee1.setEmpSal(25000);
	employee1.setEmpGender('M');

	int eno = employee1.getEmpNum();
	String name = employee1.getEmpName();
	double salary = employee1.getEmpSal();
	char gender = employee1.getEmpGender();

	System.out.println(eno + "\t" + name + "\t" + salary + "\t" + gender);

	SGMethods employee2 = new SGMethods();

	employee2.setEmpNum(1002);
	employee2.setEmpName("Tanay");
	employee2.setEmpSal(40000);
	employee2.setEmpGender('M');

	System.out.println(employee2.getEmpNum() + "\t" + employee2.getEmpName() + "\t" + employee2.getEmpSal()
			+ "\t" + employee2.getEmpGender());
}
}
