import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  
    int t = Integer.parseInt(bf.readLine());
    String[] arr = new String[t];
    
    for (int i = 0; i < t; i++) {
      arr[i] = bf.readLine();
    }
    
    for (int i = 0; i < t; i++) {
      String s = arr[i];
      System.out.println(s.charAt(0) +""+s.charAt(s.length()-1));
    }
  }
}