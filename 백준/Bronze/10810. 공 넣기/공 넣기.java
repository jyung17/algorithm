import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
  
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
  
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(bf.readLine());
    
      int I = Integer.parseInt(st.nextToken());
      int J = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());
    
      for (int j = I-1; j < J; j++) {
        arr[j] = K;
      }
    }
  
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}