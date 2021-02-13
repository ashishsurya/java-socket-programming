
import java.io.*;
import java.net.*;
import java.util.*;

class Server{
	public static void main(String a[]) throws IOException {
		ServerSocket ss=new ServerSocket(8000);
		System.out.println("I am a server and,  I am Waiting for client");
		Socket s=ss.accept();
		System.out.println("Connected to client Successfully !");

		Scanner br=new Scanner(System.in);
		PrintWriter get=new PrintWriter(s.getOutputStream());
		while(true){
			System.out.println("enter message to send:");
			String str=br.nextLine();
			get.println(str);
			get.flush();
			if(str.equals("end")){
				break;
			}
		}
	}
}
