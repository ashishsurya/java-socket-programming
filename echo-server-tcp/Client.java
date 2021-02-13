import java.io.*;
import java.net.*;
import java.util.*;

class Client {
  public static void main(String args[]) throws IOException {
    Socket s = new Socket("localhost", 8000);
    System.out.println("Connected to the server at localhost");
    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    Scanner brr = new Scanner(System.in);
    PrintWriter print = new PrintWriter(s.getOutputStream());
    while (true) {
      System.out.println("Enter message to send:");
      String str = brr.nextLine();
      print.println(str);
      print.flush();
      String st = br.readLine();
      System.out.println("Message Received fromthe server: " + st);
      if (st.equals("end"))
        break;
    }
  }
}