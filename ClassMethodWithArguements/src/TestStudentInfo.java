
public class TestStudentInfo {
public static void main(String[] args) {
	SampleStudentInfo st1 = new SampleStudentInfo();
	
	SampleStudentInfo st2 = new SampleStudentInfo();
	
	SampleStudentInfo st3 = new SampleStudentInfo();
	
	st1.setData(1001,"xyz",23,1500);
	
	st2.setData(1002,"abc",24,2000);
	
	st3.setData(1003, "ijk",25,2500);
	
	st1.display();
	
	st2.display();
	
	st3.display();		

	
}
}
