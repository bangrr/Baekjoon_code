import java.io.*;
import java.util.*;

public class Bj_2914 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int i = Integer.parseInt(st.nextToken());
		System.out.print(a * (i - 1) + 1);
	}
}