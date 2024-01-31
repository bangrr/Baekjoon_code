import java.io.*;
import java.util.*;

public class Bj_2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] arr = new int[9][9];
		for (int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max = arr[0][0];
		int r = 1;
		int c = 1;
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
					r = i+1;
					c = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.print(r + " " + c);
	}
}