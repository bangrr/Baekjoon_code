import java.io.*;
import java.util.*;

public class Bj_5596 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = 0, m = 0;
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<4; i++) {
			n += Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<4; i++) {
			m += Integer.parseInt(st.nextToken());
		}
		
		System.out.print(Math.max(n, m));
	}
}