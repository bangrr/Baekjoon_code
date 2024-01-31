import java.io.*;
import java.util.*;

public class Bj_14065 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		double x = Double.parseDouble(br.readLine());
		System.out.print(3.785411784/1609.344/x*100000);
	}
}