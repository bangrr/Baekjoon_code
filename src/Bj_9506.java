import java.io.*;
import java.util.*;

public class Bj_9506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(1);
			int n = Integer.parseInt(br.readLine());
			if (n == -1) {
				break;
			}
			for (int i=2; i*i<=n; i++) {
				if (n % i == 0) {
					list.add(i);
					list.add(n/i);
				}
			}
			
			Collections.sort(list);
			int sum = 0;
			for (int a : list) {
				sum += a;
			}
			if (sum == n) {
				sb.append(n).append(" = ").append(1);
				for (int i=1; i<list.size(); i++) {
					sb.append(" + ").append(list.get(i));
				}
			} else {
				sb.append(n).append(" is NOT perfect.");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}