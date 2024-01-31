import java.io.*;
import java.util.*;

public class Bj_1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		while (t-->0) {
			LinkedList<int[]> que = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int cnt = 0;
			
			st = new StringTokenizer(br.readLine());
			for (int i=0; i<n; i++) {
				que.add(new int[] {i,Integer.parseInt(st.nextToken())});
			}
			
			while (!que.isEmpty()) {
				int[] front = que.poll();
				boolean isMax = true;
				
				for (int i=0; i<que.size(); i++) {
					if (front[1] < que.get(i)[1]) {
						que.add(front);
						for (int j=0; j<i; j++) {
							que.add(que.poll());
						}
						isMax = false;
						break;
					}
				}
				if (isMax == false) {
					continue;
				}
				
				cnt++;
				if (front[0] == m) {
					break;
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
	}
}