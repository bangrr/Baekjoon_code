import java.io.*;
import java.util.*;

public class Bj_27294 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		if (t >= 12 && t <= 16 && s == 0) {
			System.out.print(320);
		} else {
			System.out.print(280);
		}
	}
}