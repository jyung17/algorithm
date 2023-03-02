import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    int[] arr = new int[n];
    
    StringTokenizer st = new StringTokenizer(bf.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    int v = Integer.parseInt(bf.readLine());
    int count = 0;
    
    for (int i = 0; i < n; i++) {
      if(arr[i] == v) {
        count++;
      }
    }
    System.out.println(count);
  }
}