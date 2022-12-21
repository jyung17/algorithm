import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int[] arr = new int[26];
    
    String str = st.nextToken();
    for (int i = 0; i < str.length(); i++) {
      arr[str.charAt(i) - 'a']++;
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}