import java.io.*;
import java.util.*;
 
public class Bj_1495 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<Integer>[] setList = new HashSet[n+1];
        for (int i=0; i<=n; i++) setList[i] = new HashSet<Integer>();
        setList[0].add(s);
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            int v = Integer.parseInt(st.nextToken());
            for (int it : setList[i-1]) {
                int up = it+v;
                int dw = it-v;
                if (up <= m) setList[i].add(up);
                if (dw >= 0) setList[i].add(dw);
            }
            if (setList[i].isEmpty()) {
                System.out.print(-1);
                return;
            }
        }
 
        int max = 0;
        for (int it : setList[n]) {
            max = Math.max(max, it);
        }
        System.out.print(max);
	}
}