import java.net.*;  
import java.io.*;  
import java.util.*;
class SendServer{  
public static void main(String args[])throws Exception{  
ServerSocket ss=new ServerSocket(80);  
Socket s=ss.accept();   
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
  Scanner scan=new Scanner(System.in);
String str="",str2="";  
System.out.println("Started");
while(!str.equals("stop")){   
{System.out.println("Enter message");
    str=scan.nextLine();
dout.writeUTF(""+str);  
dout.flush();  
 }}
 
s.close();  
ss.close();  
}}  