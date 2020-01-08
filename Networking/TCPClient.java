

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		Socket s=null;
		DataInputStream dis=null;
		DataInputStream dis1=null;
		DataOutputStream dos=null;
		try
		{
			s=new Socket("localHost", 1122);
			dis=new DataInputStream(s.getInputStream());
			dis1=new DataInputStream(System.in);
			dos=new DataOutputStream(s.getOutputStream());
			while(true)
			{
				System.out.println("enter a message");
				String msg = dis1.readLine();
					
				dos.writeBytes(msg+"\n");
				
				String rpl=dis.readLine();
				System.out.println(rpl);
				
			}
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
