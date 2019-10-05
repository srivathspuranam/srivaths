package stringBuffer;

public class Test {
public static void main(String[] args) {
	
	StringBuffer s1= new StringBuffer();
	
	String record1 ="100:srivaths:30000:analyst:M";
	String record6 ="101:Tanay:40000:engineer:M";
	String record2 ="102:Abhiram:25000:Software:M";
	String record3 ="103:Prerana:100000:engineer:F";
	String record4 ="104:Himaja:24000:support:F";
	String record5 ="105:Amani:25000:analyst:F";
	
	s1.append(record1);
	s1.append("\n");
	s1.append(record2);
	s1.append("\n");
	s1.append(record3);
	s1.append("\n");
	s1.append(record4);
	s1.append("\n");
	s1.append(record5);
	s1.append("\n");
	s1.append(record6);
	
	String s2 = s1.toString();
	String [] records = s2.split("\n");

	for (String record : records)
	{
		System.out.println (record);
	{
			String[] fields = record.split(":");
			System.out.println (fields[1]);
			System.out.println (fields[4]);
		}
	}
	}
}
