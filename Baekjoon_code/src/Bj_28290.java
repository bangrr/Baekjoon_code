import java.io.*;
import java.util.*;

public class Bj_28290 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		String[] db = {"fdsajkl;", "jkl;fdsa", "asdf;lkj", ";lkjasdf", "asdfjkl;", ";lkjfdsa"};
		String[] out = {"in-out", "in-out", "out-in", "out-in", "stairs", "reverse"};
		
		for (int i=0; i<6; i++) {
			if (db[i].equals(s)) {
				System.out.print(out[i]);
				return;
			}
		}
		System.out.print("molu");
	}
}