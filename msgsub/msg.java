import java.io.*;

class msg
{
public static void main(String a[])throws Exception
{

try
{
	Runtime r=Runtime.getRuntime();
	Process p=null;
	String msg;
	String TRIP;
	String cmd;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the IP address of remote host:");
	TRIP=br.readLine();
	
	System.out.println("Enter the Message to send to the remote host:");
	msg=br.readLine();
	
	cmd="net send " + TRIP+ " " + msg;
	p=r.exec(cmd);
	Thread.sleep(1000);	
	System.out.println("Message Successfully sent to the remote system");
}
catch(Exception e)
{System.out.println(e);}
	
}
}
