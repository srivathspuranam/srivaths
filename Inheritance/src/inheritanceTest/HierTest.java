package inheritanceTest;

public class HierTest {
public static void main(String[] args) {
	Hier2 student = new Hier2();

	student.setData(1001, "Srivaths", "male", 21, "java", 15000, 5000, 'A');

	student.display();

	Hier3 employee = new Hier3();

	employee.setData(40, "Tanay", "Male", 22, "Mech", 40000, "Engineer");

	employee.display();


}
}
