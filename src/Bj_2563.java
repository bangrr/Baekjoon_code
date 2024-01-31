import java.io.*;
import java.util.*;

public class Bj_2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[100][100];
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			for (int x=X; x<X+10; x++) {
				for (int y=Y; y<Y+10; y++) {
					arr[x][y] = 1;
				}
			}
		}
		for (int i=0; i<100; i++) {
			for (int j=0; j<100; j++) {
				if (arr[i][j] == 1) {
					sum++;
				}
			}
		}
		System.out.print(sum);
	}
}