package inheritanceTest;

public class Hier3 extends Hier1 { // calling the hierarchy parent(hier1)
	String dept;
	double salary;
	String desg;

	public void setData(int pid, String name, String gender, int age, String dept, double salary, String desg) {
		setData(pid, name, gender, age);
		this.dept = dept;
		this.salary = salary;
		this.desg = desg;
	}
	public void display() {
		super.display();
		System.out.println(dept + "\t" + salary + "\t" + desg);
	}
}
