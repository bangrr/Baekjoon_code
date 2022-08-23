import java.util.*;

public class Bj_11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			list.add(i);
		}
		
		int a = k-1;
		
		sb.append("<");
		while(!list.isEmpty()) {
			if (list.size() == 1) {
				sb.append(list.get(0));
				break;
			} else if (list.size() <= a) {
				a = a % list.size();
			}
			sb.append(list.get(a) + ", ");
			list.remove(a);
			a = a + k-1;
		}
		sb.append(">");
		System.out.println(sb);
		sc.close();
	}
}