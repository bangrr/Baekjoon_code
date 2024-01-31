import java.util.*;

public class Bj_1919 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		char[] ca = a.toCharArray();
		char[] cb = b.toCharArray();
		
		Arrays.sort(ca);
		Arrays.sort(cb);
		
		int i = 0;
		int j = 0;
		int cnt = ca.length + cb.length;
		
		while (i < ca.length && j < cb.length) {
			if (ca[i] == cb[j]) {
				i++;
				j++;
				cnt = cnt - 2;
			} else if (ca[i] > cb[j]) {
				j++;
			} else if (ca[i] < cb[j]) {
				i++;
			}
		}
		System.out.print(cnt);
		sc.close();
	}
}