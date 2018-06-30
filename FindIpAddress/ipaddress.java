import java.io.*;
import java.net.InetAddress;
import java.util.*;

public class ipaddress
{
public static void main(String args[])
{
String s=" ";
try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name/ip of Host:");
s=sc.next();
InetAddress ad=InetAddress.getByName(s);
System.out.println("Host ip:"+ad.getHostAddress());
System.out.println("Host name:"+ad.getHostName());
System.out.println("Host system:"+ad.getLocalHost());
}
catch(Exception e)
{
System.out.println(e);
}
}
}