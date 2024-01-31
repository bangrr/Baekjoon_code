import java.util.*;

public class Bj_1059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int[] S = new int[L+1];
		for (int i=1; i<S.length; i++) {
			S[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		
		Arrays.sort(S);
		int cnt = 0;
		for (int i=1; i<S.length; i++) {
			if (S[i] == n) {
				cnt = 0;
				break;
			} else if (S[i] > n) {
				cnt = (S[i]-n)*(n-S[i-1])-1;
				break;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}