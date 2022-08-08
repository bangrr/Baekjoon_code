import java.util.*;

public class Bj_1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		int[] a = new int[n+1];
		int num = 1;
		
		for (int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] >= num) {
				while (a[i] >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				int p = stack.pop();
				if (p > a[i]) {
					System.out.print("NO");
					return;
				} else {
					sb.append("-\n");
				}
			}
		}
		System.out.print(sb);
		sc.close();
	}
}