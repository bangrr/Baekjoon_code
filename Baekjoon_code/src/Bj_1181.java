import java.util.Arrays;
import java.util.Scanner;

public class Bj_1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = sc.next();
		}
		Arrays.sort(arr);
		
		if (n>1) {
			for (int j=1; j<=50; j++) {
				for (int i=0; i<n; i++) {
					if (i==n-1 && arr[i].length() == j) {
							System.out.println(arr[i]);
					} else if (arr[i].length() == j && !(arr[i].equals(arr[i+1]))) {
							System.out.println(arr[i]);
					}
				}
			}
		} else if (n==1) {
			System.out.println(arr[0]);
		}
		sc.close();
	}
}
