import java.io.*;
import java.util.*;
 
public class Bj_31246 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = b-a;
            if (c > 0) list.add(c);
            else cnt++;
        }
        Collections.sort(list);
        System.out.print(cnt < k ? list.get(k-cnt-1) : 0);
	}
}