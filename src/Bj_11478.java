import java.io.*;
import java.util.*;

public class Bj_11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<String> set = new HashSet<>();
		String s = br.readLine();
		int n = s.length();
		
		for (int i=1; i<=n; i++) {
			for (int j=0; j<=n-i; j++) {
//				System.out.println(s.substring(j, j+i));
				set.add(s.substring(j, j+i));
			}
		}
		System.out.print(set.size());
	}
}