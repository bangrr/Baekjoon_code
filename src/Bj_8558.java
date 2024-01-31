import java.io.*;
import java.util.*;

public class Bj_8558 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		if (n <= 1) {
			System.out.println(1);
		} else if (n == 2) {
			System.out.println(2);
		} else if (n == 3) {
			System.out.println(6);
		} else if (n == 4) {
			System.out.println(4);
		} else {
			System.out.println(0);
		}
	}
}