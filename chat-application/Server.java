import java.io.*;
import java.net.*;
import java.util.*;

class tcpserver {
  public static void main(String a[]) throws IOException {
    ServerSocket ss = new ServerSocket(8000);
    System.out.println("-----------------------------------------------");
    System.out.println("I am a server , and I starated serving");
    Socket s = ss.accept();
    Scanner brr = new Scanner(System.in);
    PrintWriter print = new PrintWriter(s.getOutputStream());
    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    while (true) {
      String str = br.readLine();
      System.out.println("Message Received from your Client:" + str);
      if (str.equals("end"))
        break;
      System.out.println("Enter message to send:");
      String st = brr.nextLine();
      print.println(st);
      print.flush();
    }
  }
}