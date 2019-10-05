package collectionFrame;

import java.util.ArrayList;
import java.util.Iterator;

public class Array2 {
public static void main(String[] args) {
	
	String record1 = "101:srivaths:30000:Devloper:21";
	String record2 = "102:Tanay:40000:Engineer:21";
	String record3 = "103:Abhiram:30000:SAP:21";
	String record4 = "104:Prerana:60000:Engineer:21";
	String record5 = "105:himaja:23000:Support:21";
	
		ArrayList<Array2> s1 = new ArrayList<Array2>();
	
		Array2 employee= new Array2();
		
		String[] fields = record1.split(":");
		
		employee.setEmpNum(Integer.parseInt(fields[0]));
		employee.setEmpName(fields[1]);
		employee.setEmpSalary(Double.parseDouble(fields[2]));
		employee.setEmpDept(fields[3]);
		employee.setEmpAge(Integer.parseInt(fields[4]));
	
		s1.add(employee);

		employee = new Array2();

		fields = record2.split(":");

		employee.setEmpNum(Integer.parseInt(fields[0]));
		employee.setEmpName(fields[1]);
		employee.setEmpSalary(Double.parseDouble(fields[2]));
		employee.setEmpDept(fields[3]);
		employee.setEmpAge(Integer.parseInt(fields[4]));
	
				
				s1.add(employee);

		employee = new Test2();

		fields = record3.split(":");

		employee.setEmpNum(Integer.parseInt(fields[0]));
		employee.setEmpName(fields[1]);
		employee.setEmpSalary(Double.parseDouble(fields[2]));
		employee.setEmpDept(fields[3]);
		employee.setEmpAge(Integer.parseInt(fields[4]));
				
		s1.add(employee);

		employee = new Test2();

		fields = record4.split(":");

		employee.setEmpNum(Integer.parseInt(fields[0]));
		employee.setEmpName(fields[1]);
		employee.setEmpSalary(Double.parseDouble(fields[2]));
		employee.setEmpDept(fields[3]);
		employee.setEmpAge(Integer.parseInt(fields[4]));
				
		s1.add(employee);

		Iterator<Array2> iterator = s1.iterator();

		while (iterator.hasNext()) {
			Array2 emp = iterator.next();

			int empNum = emp.getEmpNum();

			String empName = emp.getEmpName();

			double empSalary = emp.getEmpSalary();

			String empDept = emp.getEmpDept();
			
			int empAge = emp.getEmpAge();
						
			System.out.println(empNum + "\t" + empName + "\t" + empSalary + "\t" + empAge +"\t" + empDept);

		}
		}

private int getEmpNum() {
	// TODO Auto-generated method stub
	return 0;
}

private String getEmpName() {
	// TODO Auto-generated method stub
	return null;
}

private int getEmpAge() {
	// TODO Auto-generated method stub
	return 0;
}

private String getEmpDept() {
	// TODO Auto-generated method stub
	return null;
}

private double getEmpSalary() {
	// TODO Auto-generated method stub
	return 0;
}
}
