import java.io.*;
import java.util.*;

public class Bj_1789 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		long s = Long.parseLong(br.readLine());
		
		for (long i=1; i<=2147483647; i++) {
			if (s < i*(i+1)/2) {
				System.out.println(i-1);
				break;
			}
		}
	}
}