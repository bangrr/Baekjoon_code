import java.io.*;
import java.util.*;
 
public class Bj_30585 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int z = 0;
		int o = 0;
		for (int i=0; i<n; i++) {
			String s = br.readLine();
            for (int j=0; j<m; j++) {
                if (s.charAt(j)=='0') z++;
                else o++;
            }
		}
		System.out.print(Math.min(z,o));
	}
}