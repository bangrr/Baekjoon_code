import java.io.*;
import java.util.*;

public class Bj_10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		Set<Integer> set = new HashSet<>();
		while (n-- > 0) { // set에 상근이가 가진 카드를 넣는다
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while (m-- > 0) {
			if (set.contains(Integer.parseInt(st.nextToken()))) {
				sb.append(1);
			} else {
				sb.append(0);
			}sb.append(" ");
		}
		System.out.print(sb.toString());
	}
}