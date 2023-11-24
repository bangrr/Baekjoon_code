import java.io.*;
import java.util.*;
 
public class Bj_20310 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
        int zr=0, on=0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='0') zr++;
            else on++;
        }
        int hz=zr/2, ho=on/2;
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='0') {
                if (zr>hz) sb.append(ch);
                zr--;
            } else if (ch=='1') {
                if (on<=ho) sb.append(ch);
                on--;
            }
        }
        System.out.print(sb);
	}
}