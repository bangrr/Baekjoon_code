import java.util.Scanner;

public class Bj_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		int[] cnt = new int[26];
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				cnt[s.charAt(i)-65]++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
				cnt[s.charAt(i)-97]++;
			}
		}
		
		int max = 0;
		char ch = 0;
		for (int i=0; i<cnt.length; i++) {
			if (cnt[i] > max) {
				max = cnt[i];
				ch = (char)(i+65);
			} else if (cnt[i] == max) {
				ch = '?'; 
			}
		}
		System.out.println(ch);
	}
}
