
import java.io.*;
import java.net.*;
import java.util.*;

class tcpclient {
  public static void main(String args[]) throws IOException {
    Socket s = new Socket("localhost", 8000);
    System.out.println("-------------------------------");
    System.out.println("Connected to Server at localhost");
    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    Scanner brr = new Scanner(System.in);
    PrintWriter get = new PrintWriter(s.getOutputStream());
    while (true) {
      System.out.println("Enter message to send:");
      String str = brr.nextLine();
      get.println(str);
      get.flush();
      String st = br.readLine();
      System.out.println("Message Received from your server: " + st);
      if (st.equals("end"))
        break;
    }
  }
}