import java.io.*;
import java.util.*;

public class Bj_25192 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		int ans = 0;
		
		while (n-- > 0) {
			String s = br.readLine();
			if ("ENTER".equals(s)) {
				ans += set.size();
				set = new HashSet<>();
			} else {
				set.add(s);
			}
		}
		ans += set.size();
		System.out.print(ans);
	}
}