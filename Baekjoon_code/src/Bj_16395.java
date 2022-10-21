import java.util.*;
 
public class Bj_16395 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = Math.max(n-k+1, k);
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                if (j==0 || j==i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
        System.out.print(arr[n-1][c-1]);
        sc.close();
	}
}