import java.io.*;
import java.util.*;
 
public class Bj_18115 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=n-1; i>=0; i--) arr[i] = Integer.parseInt(st.nextToken());
        int item = 1;
        for (int cmd : arr) {
            if (cmd==1) {
                dq.addFirst(item);
            } else if (cmd==2) {
                int tmp = dq.pollFirst();
                dq.addFirst(item);
                dq.addFirst(tmp);
            } else {
                dq.addLast(item);
            }
            item++;
        }
        for (int it : dq) sb.append(it).append(" ");
        System.out.print(sb);
	}
}