import java.util.*;

public class Bj_11651 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] a = new int[n][2];
		for (int i=0; i<n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		Arrays.sort(a, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			} else {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		for (int i=0; i<n; i++) {
			System.out.println(a[i][0] + " " + a[i][1]);
		}
		sc.close();
	}
}