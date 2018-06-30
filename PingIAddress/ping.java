import java.io.*;
import java.net.InetAddress;
import java.util.*;
public class ping
{
public static void main(String args[])
{
String ip=" ";
try
{ 
Scanner s=new Scanner(System.in);
System.out.println("enter ip address of remote host");
ip=s.nextLine ();
String pingcmd="ping "+ip;
Runtime r=Runtime.getRuntime();
Process p=r.exec(pingcmd);
Scanner s1=new Scanner(p.getInputStream());
String inputline=" ";
while(s1.hasNextLine())
{
inputline=s1.nextLine();
System.out.println(":  :"+inputline);}
}
catch( Exception e)
{
System.out.println(e);}
}
}
