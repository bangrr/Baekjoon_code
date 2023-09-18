import java.io.*;
import java.util.*;

public class Bj_30017 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if (a-1 > b) {
			System.out.println(2*b+1);
		} else {
			System.out.println(2*a-1);
		}
	}
}