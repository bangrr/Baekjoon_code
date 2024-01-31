import java.io.*;
import java.util.*;

public class Bj_16212 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		while (n-- > 0) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arr);
		
		for (Integer it : arr) {
			sb.append(it).append(" ");
		}
		System.out.print(sb);
	}
}