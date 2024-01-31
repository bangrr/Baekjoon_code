import java.io.*;
import java.util.*;

public class Bj_30030 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int b = Integer.parseInt(br.readLine());
		System.out.println(b/11*10);
	}
}