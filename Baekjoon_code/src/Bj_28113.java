import java.io.*;
import java.util.*;

public class Bj_28113 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if (a == b) {
			System.out.print("Anything");
		} else if (a < b) {
			System.out.print("Bus");
		} else if (a > b) {
			System.out.print("Subway");
		}
	}
}