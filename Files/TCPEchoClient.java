
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class TCPEchoClient {
public static void main(String[] args) {
	Socket s = null;
	DataInputStream dis = null;
	DataOutputStream dos = null;
	DataInputStream s1 = null;
	
	try{
	s= new Socket("Localhost",2341);
	dis = new DataInputStream(s.getInputStream());
	dos = new DataOutputStream(s.getOutputStream());
	s1= new DataInputStream(System.in);
	
	while(true)
	{
		 {
			 System.out.print("Enter Input : ");
			 String input = s1.readLine();
			
			 dos.writeBytes(input+"\n");
			 
			 String reply = dis.readLine();
			 System.out.println (reply);				
		 }		
	}
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}
}
