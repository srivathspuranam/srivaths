

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
public static void main(String[] args) {
	ServerSocket ss=null;
	Socket s=null;
	DataInputStream dis=null;
	DataInputStream dis1=null;
	DataOutputStream dos=null;
	try
	{
		ss=new ServerSocket(1122);
       
		System.out.println("waiting for the request from the client");
		s=ss.accept();
		System.out.println("request accepted from, the client");
		 	dis=new DataInputStream(s.getInputStream());
			dis1=new DataInputStream(System.in);
			dos=new DataOutputStream(s.getOutputStream());
		
		while(true)
		{
		   String message = dis.readLine();
		  
		   System.out.println("enter yopur rply");
		   String rply=dis1.readLine();
		   dos.writeBytes(rply+"\n");
		   
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
