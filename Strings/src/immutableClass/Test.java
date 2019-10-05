package immutableClass;

public class Test {
public static void main(String[] args) {
	//creating and initializing object.
			Immutable s1 = new Immutable(50,60);

			//Cloning  s2 from s1
			Immutable s2 = s1.newInstance();	
			
	// creating s3 object and copying s1 data into s3.
			Immutable s3 = new Immutable(10,20);
			
			if(s1!=s2)
			{
				System.out.println("cloned");
			}
			else
			{
				System.out.println("cloning failed");
			}

	if(s1!=s3)
			{
				System.out.println("Copy created");
			}
			else
			{
				System.out.println("copy failed");
			}
			
			System.out.println(s1.geta()+"\t"+s1.getb());
			System.out.println(s2.geta()+"\t"+s2.getb());
			System.out.println(s3.geta()+"\t"+s3.getb());
}
}
