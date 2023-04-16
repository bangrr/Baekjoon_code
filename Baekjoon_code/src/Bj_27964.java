import java.io.*;
import java.util.*;

public class Bj_27964 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Set<String> topping = new HashSet<>();
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			String s = st.nextToken();
			int l = s.length();
			if (l > 5 && "Cheese".equals(s.substring(l-6))) {
				if(!topping.contains(s)) {
					topping.add(s);
				}
			}
			if (topping.size() == 4) {
				System.out.print("yummy");
				return;
			}
		}
		System.out.print("sad");
	}
}