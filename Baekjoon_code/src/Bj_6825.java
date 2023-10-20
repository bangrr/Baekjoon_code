import java.io.*;
import java.util.*;

public class Bj_6825 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		double w = Double.parseDouble(br.readLine());
		double h = Double.parseDouble(br.readLine());
		double b = w/(h*h);
		if (b > 25) {
			System.out.println("Overweight");
		} else if (18.5 <= b && b <= 25) {
			System.out.println("Normal weight");
		} else if (b < 18.5) {
			System.out.println("Underweight");
		}
	}
}