

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
public static void main(String[] args) {
	
	ServerSocket ss= null;
	Socket s = null;
	DataInputStream dis = null;
	DataOutputStream dos = null;
	
	try{
		 ss = new ServerSocket(2341);
		 System.out.println ("Waiting for the client request");
		
		 s = ss.accept();
		 System.out.println ("received request from the clien");
		 
		 dis =  new DataInputStream(s.getInputStream());
		
		 dos = new DataOutputStream(s.getOutputStream());
					
		while(true)
		{
			String message = dis.readLine();
			
			System.out.println (message);
			
			dos.writeBytes(message+"\n");
		}			
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}
}
