import java.util.*;

public class Bj_2490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		char[] c = {'E', 'A', 'B', 'C', 'D'};
		for (int j=0; j<3; j++) {
			int cnt = 0;
			for (int i=0; i<4; i++) {
				n = sc.nextInt();
				if (n==0) {
					cnt++;
				}
			}
			System.out.println(c[cnt]);
		}
		sc.close();
	}
}