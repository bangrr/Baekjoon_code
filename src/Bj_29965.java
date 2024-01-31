import java.io.*;
import java.util.*;

public class Bj_29965 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		long aSum = 0;
		long bSum = 0;
		int aCnt = 0;
		int bCnt = 0;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			char c = st.nextToken().charAt(0);
			int p = Integer.parseInt(st.nextToken());
			if (c == 'M') {
				aSum += p;
				aCnt++;
			} else if (c == 'J') {
				bSum += p;
				bCnt++;
			}
		}
		
		if (aCnt > 0 && bCnt > 0) {
			long aa = aSum * bCnt;
			long bb = bSum * aCnt;
			System.out.println(aa == bb ? 'V' : aa > bb ? 'M' : 'J');
		} else if (aCnt == 0) {
			System.out.println(bSum > 0 ? 'J' : 'V');
		} else if (bCnt == 0) {
			System.out.println(aSum > 0 ? 'M' : 'V');
		}
	}
}