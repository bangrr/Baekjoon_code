import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Bj_29197 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		Set<BigDecimal> set = new HashSet<>();
		Set<BigDecimal> get = new HashSet<>();
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			BigDecimal x = new BigDecimal(Integer.parseInt(st.nextToken()));
			BigDecimal y = new BigDecimal(Integer.parseInt(st.nextToken()));
			
			if (x.equals(BigDecimal.ZERO) && y.compareTo(BigDecimal.ZERO) > 0) {
				set.add(new BigDecimal(10001));
			} else if (x.equals(BigDecimal.ZERO) && y.compareTo(BigDecimal.ZERO) < 0) {
				set.add(new BigDecimal(10002));
			} else if (y.equals(BigDecimal.ZERO) && x.compareTo(BigDecimal.ZERO) > 0) {
				set.add(new BigDecimal(10003));
			} else if (y.equals(BigDecimal.ZERO) && x.compareTo(BigDecimal.ZERO) < 0) {
				set.add(new BigDecimal(10004));
			} else if (x.compareTo(BigDecimal.ZERO) > 0) {
				set.add(y.divide(x, 9966, RoundingMode.HALF_UP));
			} else if (x.compareTo(BigDecimal.ZERO) < 0) {
				get.add(y.divide(x, 9966, RoundingMode.HALF_UP));
			}
		}
		System.out.println(set.size()+get.size());
	}
}