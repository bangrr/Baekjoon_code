import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Bj_29198 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		String[] table = new String[N];
		for (int i=0; i<N; i++) { // 300
			char[] tmp = br.readLine().toCharArray();
			Arrays.sort(tmp);
			table[i] = String.valueOf(tmp);
		}
		Arrays.sort(table);// 90000 * 17
		
//		for (int i=0; i<N; i++) { // 300
//			System.out.println(table[i]);
//		}
		for (int i=0; i<K; i++) { // 300
			sb.append(table[i]);
		}
//		System.out.println(sb.toString());
		
//		sb.toString().chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		
//		char[] cc = sb.toString().toCharArray();
//		Arrays.sort(cc); // 90000 * 17
		List<Character> str = sb.toString().chars().mapToObj(c -> (char)c).collect(Collectors.toList());
//		for (char c : str) {
//	        System.out.println(c);
//	    }
		
		sb.setLength(0);
		for (int a=65; a<97; a++) { // 32 * 90000
			int cnt = 0;
			for (int i=0; i<str.size(); i++) {
				if(str.get(i) == a) {
					sb.append(str.get(i));
				}
			}
			for (int i=0; i<cnt; i++) {
				str.remove(a);
			}
		}
		System.out.println(sb);
	}
}