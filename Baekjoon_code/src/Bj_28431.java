import java.io.*;
import java.util.*;

public class Bj_28431 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int[] arr = new int[10];
		for (int i=0; i<5; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		for (int i=0; i<10; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(i);
				return;
			}
		}
	}
}