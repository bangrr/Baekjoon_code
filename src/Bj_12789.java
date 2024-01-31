import java.io.*;
import java.util.*;
 
public class Bj_12789 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        Stack<Integer> temp = new Stack<>();
 
        int seq = 1;
		int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
            int o = Integer.parseInt(st.nextToken());
            while (!temp.isEmpty()) {
                if (seq == temp.peek().intValue()) {
                    temp.pop();
                    seq++;
                } else {
                    break;
                }
	    	}
            if (seq == o) {
                seq++;
            } else {
                temp.push(o);
            }
		}
        while (!temp.isEmpty()) {
            if (seq != temp.pop().intValue()) {
                System.out.print("Sad");
                return;
            }
            seq++;
        }
        System.out.print("Nice");
	}
}