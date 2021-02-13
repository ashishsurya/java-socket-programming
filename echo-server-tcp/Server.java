
import java.io.*;
import java.net.*;
import java.util.*;

class Server {
  public static void main(String a[]) throws IOException {
    ServerSocket ss = new ServerSocket(8000);
    System.out.println("\n I am a server, and I started serving \n");
    Socket s = ss.accept();
    PrintWriter print = new PrintWriter(s.getOutputStream());
    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    while (true) {
      String str = br.readLine();
      System.out.println("Message Received:" + str);
      print.println(str);
      print.flush();
      if (str.equals("end"))
        break;
    }
  }
}