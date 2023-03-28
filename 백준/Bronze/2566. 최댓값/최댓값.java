import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] a = new int[9][9];
		int max = -1;
		int x = 0;
		int y = 0;
		
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				a[i][j] += Integer.parseInt(st.nextToken());
				if(max < a[i][j]) {
					max = a[i][j];
					x = i+1;
					y = j+1;
					
				}
			}
		}
		System.out.println(max);
		System.out.println(x + " " + y);
	}
}