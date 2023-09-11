import java.io.*;
import java.util.*;

public class Bj_29722 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	// main 메소드
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());

		int y = Integer.parseInt(s.substring(0, 4));
		int m = Integer.parseInt(s.substring(5, 7));
		int d = Integer.parseInt(s.substring(8, 10));
		
		d = d + n % 30;
		if (d > 30) { d-=30; m++; }
		m = m + n % 360 / 30;
		if (m > 12) { m-=12; y++; }
		y = y + n / 360;

		System.out.println(y + "-" + (m < 10 ? "0" + m : m) + "-" + (d < 10 ? "0" + d : d));
	}
}