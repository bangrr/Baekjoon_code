import java.io.*;
import java.util.*;

public class Bj_1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		LinkedList<Integer> list = new LinkedList<>();
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
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
	}
}