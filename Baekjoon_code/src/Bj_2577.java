import java.util.Scanner;

public class Bj_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] cnt = new int[10];
		
		String s = Integer.toString(a*b*c);
		for (int i=0; i<s.length(); i++) {
			cnt[s.charAt(i)-48]++;
		}
		for (int i=0; i<cnt.length; i++) {
			System.out.println(cnt[i]);
		}
		
		sc.close();
	}
}
