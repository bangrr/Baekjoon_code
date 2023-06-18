import java.io.*;
import java.util.*;

public class Bj_28235 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		if ("SONGDO".equals(s)) {
			System.out.print("HIGHSCHOOL");
		} else if ("CODE".equals(s)) {
			System.out.print("MASTER");
		} else if ("2023".equals(s)) {
			System.out.print("0611");
		} else if ("ALGORITHM".equals(s)) {
			System.out.print("CONTEST");
		}
	}
}