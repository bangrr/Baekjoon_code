import java.util.*;

public class Bj_3273 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int x = sc.nextInt();
		int cnt = 0;
		int start = 0, end = n-1;
		while (start < end) {
			int sum = a[start] + a[end];
			if (sum == x) {
				cnt++;
				start++;
				end--;
			} else if (sum < x) {
				start++;
			} else if (sum > x) {
				end--;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}