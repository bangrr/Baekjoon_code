import java.io.*;
import java.util.*;
 
public class Bj_12761 {
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
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
 
        int[] nd = new int[100001];
		Queue<Integer> q = new LinkedList<>();
		q.add(n);
//int cnt=0;
		while(!q.isEmpty()) {
			int cur = q.poll();
			if (cur == m) {
//System.out.println("cnt : " + cnt);
				System.out.print(nd[cur]);
				return;
			}
			int[] move = {cur+1, cur-1, cur+a, cur-a, cur+b, cur-b, cur*a, cur*b};
			for(int i=0; i<8; i++) {
                int next = move[i];
			    if (next >= 0 && next <= 100000 && (nd[next]==0 || nd[next]>nd[cur]+1)) {
//cnt++;
				    q.add(next);
				    nd[next] = nd[cur]+1;
			    }
            }
		}
	}
}