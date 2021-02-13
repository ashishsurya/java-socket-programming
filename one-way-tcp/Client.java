import java.io.*;
import java.net.*;

class Client{
	public static void main(String args[])throws IOException{
		Socket s=new Socket("localHost", 8000);
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		while(true){
			String str=br.readLine();
			System.out.println("Message Received:"+str);
			if(str.equals("end")){
				break;
			}
		}
	}
}
