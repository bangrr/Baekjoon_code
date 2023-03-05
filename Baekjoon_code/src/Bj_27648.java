import java.util.Scanner;

public class Bj_27648 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		if (n+m-1 <= k) {
			for (int i=1; i<=n; i++) {
				int t = i;
				for (int j=1; j<=m; j++) {
					sb.append(t++).append(" ");
				}
				sb.append("\n");
			}
			
			System.out.println("YES");
			System.out.print(sb.toString());
		} else {
			System.out.print("NO");
		}
		sc.close();
	}
}