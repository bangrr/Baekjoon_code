import java.io.*;
import java.util.*;
 
public class Bj_30468 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i=0; i<4; i++) sum += Integer.parseInt(st.nextToken());
        int res = Integer.parseInt(st.nextToken())*4-sum;
        System.out.print(res > 0 ? res : 0);
	}
}