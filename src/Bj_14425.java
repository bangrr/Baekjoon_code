import java.io.*;
import java.util.*;

public class Bj_14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Set<String> setA = new HashSet<>();
		
		while (n-- > 0) {
			setA.add(br.readLine());
		}
		
		int cnt = 0;
		for (int i=0; i<m; i++) {
			String s = br.readLine();
			if (setA.contains(s)) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}