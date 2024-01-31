import java.io.*;
import java.util.*;

public class Bj_3507 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		if (n <= 198) {
			System.out.println(199-n);
		} else {
			System.out.println(0);
		}
	}
}