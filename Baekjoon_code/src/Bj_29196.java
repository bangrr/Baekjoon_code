import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Bj_29196 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		BigDecimal b = new BigDecimal(br.readLine());
		System.out.println("YES");
		System.out.println(b.multiply(new BigDecimal(100000000)).intValue() + " " + 100000000);
	}
}