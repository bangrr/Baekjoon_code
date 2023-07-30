import java.io.*;
import java.util.*;

public class Bj_28417 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int maxWin = 0;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int maxRun = 0;
			int[] trick = new int[5];
			for (int i=0; i<2; i++) {
				maxRun = Math.max(maxRun, Integer.parseInt(st.nextToken()));
			}
			for (int i=0; i<5; i++) {
				trick[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(trick);
			maxWin = Math.max(maxWin, maxRun+trick[3]+trick[4]);
		}
		System.out.println(maxWin);
	}
}