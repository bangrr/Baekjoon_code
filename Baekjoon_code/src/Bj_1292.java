import java.util.Scanner;

public class Bj_1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] arr = new int[b+1];
		int[] sum = new int[b+1];
		int cnt = 0;
		int j = 1;
		for (int i=1; i<=b; i++) {
			arr[i] = j;
			sum[i] = sum[i-1] + arr[i];
			if (++cnt == j) {
				cnt = 0;
				j++;
			}
		}
		System.out.println(sum[b]-sum[a-1]);
		sc.close();
	}
}