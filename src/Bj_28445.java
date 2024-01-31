import java.io.*;
import java.util.*;
 
public class Bj_28445 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		String[] a = new String[4];
		st = new StringTokenizer(br.readLine());
		a[0] = st.nextToken();
		a[1] = st.nextToken();
		st = new StringTokenizer(br.readLine());
		a[2] = st.nextToken();
		a[3] = st.nextToken();
		Arrays.sort(a);
		
		ArrayList<String> list = new ArrayList<>();
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				String s = a[i] + " " + a[j];
				if (list.contains(s)) {
					continue;
				} else {
					list.add(s);
				}
			}
		}
		for (String str : list) {
			sb.append(str).append("\n");
		}
		System.out.print(sb);
	}
}