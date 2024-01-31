import java.util.Scanner;

public class Bj_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		int[] cnt = new int[26];
		for (int i=0; i<cnt.length; i++) {
			cnt[i] = -1;
		}
		for (int i=s.length()-1; i>=0; i--) {
			cnt[s.charAt(i)-97] = i;
		}
		for (int i=0; i<cnt.length; i++) {
			if (i<25) {
				System.out.print(cnt[i] + " ");
			} else {
				System.out.print(cnt[i]);
			}
		}
	}
}
