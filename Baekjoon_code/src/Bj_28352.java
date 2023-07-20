import java.io.*;
import java.util.*;

public class Bj_28352 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int a = 6;
		for (; n > 10; n--) {
			a *= n;
		}
		System.out.print(a);
	}
}