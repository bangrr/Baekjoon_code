import java.io.*;
import java.util.*;

public class Bj_30949 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		TreeMap<String, Integer> tmap = new TreeMap<>();
		String s;
		while (!(s = br.readLine()).equals("------")) {
			String[] arr = s.split(" ");
			int si = Integer.parseInt(arr[0]);
			int ei = Integer.parseInt(arr[1]);
			String name = arr[2];
			if (tmap.containsKey(name)) {
				tmap.put(name, tmap.get(name)-(ei-si));
			} else {
				tmap.put(name, -(ei-si));
			}
		}
		while (!(s = br.readLine()).equals("======")) {
			String[] arr = s.split(" ");
			int si = Integer.parseInt(arr[0]);
			int ei = Integer.parseInt(arr[1]);
			String name = arr[2];
			if (tmap.containsKey(name)) {
				tmap.put(name, tmap.get(name)+ei-si);
			} else {
				tmap.put(name, ei-si);
			}
		}
		for (String key : tmap.keySet()) {
			int tm = tmap.get(key);
			if (tm != 0) {
				sb.append(key).append(" ");
				if (tm > 0) sb.append("+");
				sb.append(tm).append("\n");
			}
		}
		if (sb.length()==0) sb.append("No differences found.");
	}
}