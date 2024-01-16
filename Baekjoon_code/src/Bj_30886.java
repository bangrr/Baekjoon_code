import java.io.*;
import java.util.*;

public class Bj_30886 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		double a = Double.parseDouble(br.readLine());
		double r = Math.sqrt(a / Math.PI);
		System.out.print(4*(r+1)*(r+1));
	}
}