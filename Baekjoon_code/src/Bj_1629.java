import java.io.*;
import java.util.*;
 
public class Bj_1629 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());
		
		ArrayList<Long> list = new ArrayList<>();
		
		long d = 1;
		long t = a;
		while (d <= b) {
			list.add(t);
			t = ((t % c) * (t % c)) % c;
			d *= 2;
		}
		d /= 2;
		
		long ans = 1;
		for (int i=list.size()-1; i>= 0; i--) {
			if (b >= d) {
				b -= d;
				ans = ((ans % c) * (list.get(i) % c)) % c;
			}
			d /= 2;
		}
		System.out.print(ans);
	}
}