import java.io.*;
import java.util.*;
 
public class Bj_30676 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        if (n>=620) {
            System.out.print("Red");
        } else if (n>=590) {
            System.out.print("Orange");
        } else if (n>=570) {
            System.out.print("Yellow");
        } else if (n>=495) {
            System.out.print("Green");
        } else if (n>=450) {
            System.out.print("Blue");
        } else if (n>=425) {
            System.out.print("Indigo");
        } else if (n>=380) {
            System.out.print("Violet");
        }
	}
}