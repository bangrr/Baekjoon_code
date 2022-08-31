import java.util.*;

public class Bj_15596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(sum(a));
		sc.close();
	}
	
	static long sum(int[] a) {
        long ans = 0;
        for (int i=0; i<a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}