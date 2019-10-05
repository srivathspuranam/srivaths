
public class SampleStudentInfo {
private int studentId;
private String StudentName;
private int age;
private double studentFee;

public void setData(int id, String Name,int Age, double fee)
{
		studentId = id;
		StudentName = Name;
		age = Age;
		studentFee = fee;

}
	public void display()
	{
	System.out.println ("STUDENT DETAILS ARE");		
	System.out.println ("ID="+studentId);
	System.out.println ("NAME="+StudentName);
	System.out.println ("AGE="+age);
	System.out.println ("FEE="+studentFee);
}
}
