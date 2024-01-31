import java.util.*;

public class Bj_10808 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		int[] c = new int[26];
		
		for (int i=0; i<s.length(); i++) {
			c[s.charAt(i)-97]++;
		}
		for (int i=0; i<c.length; i++) {
			System.out.print(c[i]);
			if (i==c.length-1) {
				break;
			}
			System.out.print(" ");
		}
		sc.close();
	}
}