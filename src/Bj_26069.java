import java.io.*;
import java.util.*;

public class Bj_26069 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		map.put("ChongChong", 1);
		while (n-- > 0) {
			String[] in = br.readLine().split(" ");
			String a = in[0] ; String b = in[1];
			if (!map.containsKey(a)) map.put(a, 0);
			if (!map.containsKey(b)) map.put(b, 0);
			if (map.get(a)==1) map.put(b, 1);
			if (map.get(b)==1) map.put(a, 1);
		}
		int cnt = 0;
		for (int it : map.values()) {
			if (it == 1) cnt++;
		}
		System.out.println(cnt);
	}
}