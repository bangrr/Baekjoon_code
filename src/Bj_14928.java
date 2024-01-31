import java.util.*;

public class Bj_14928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		int remain = 0;
		for (int i=0; i<n.length(); i++) {
			remain = (remain * 10 + (n.charAt(i) - '0')) % 20000303;
		}
		System.out.println(remain);
		sc.close();
	}
}