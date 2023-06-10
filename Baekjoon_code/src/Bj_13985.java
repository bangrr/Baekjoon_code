import java.io.*;
import java.util.*;
 
public class Bj_13985 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        String s = br.readLine();
 
        int a = s.charAt(0) - 48;
		int b = s.charAt(4) - 48;
        int c = s.charAt(8) - 48;
 
        if (a+b == c) { System.out.print("YES"); }
        else { System.out.print("NO"); }
	}
}