import java.io.*;
import java.util.*;
 
public class Bj_17009 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int a = 0, b = 0;
        a += 3*Integer.parseInt(br.readLine()) + 2*Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine());
        b += 3*Integer.parseInt(br.readLine()) + 2*Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine());
        System.out.print(a>b?"A":a<b?"B":"T");
	}
}