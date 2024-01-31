import java.util.*;

public class Bj_2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = sc.nextInt();
		
		int[][] arr = new int[15][14];
		for (int i=0; i<=14; i++) {
			for (int j=0; j<14; j++) {
				if (i==0) {
					arr[i][j] = j+1;
				} else if (j==0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i-1][j] + arr[i][j-1];
				}
			}
		}
		
		for (int i=0; i<t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			sb.append(arr[k][n-1] + "\n");
		}
		System.out.println(sb);
		sc.close();
	}
}