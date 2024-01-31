import java.util.*;

public class Bj_11328 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			char[] strA = sc.next().toCharArray();
			char[] strB = sc.next().toCharArray();
			Arrays.sort(strA);
			Arrays.sort(strB);
			
			if (Arrays.compare(strA, strB) == 0) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}
		}
		sc.close();
	}
}