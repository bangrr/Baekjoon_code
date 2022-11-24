import java.io.*;
import java.util.*;

public class Bj_2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		System.out.print(Integer.parseInt(n, b));
	}
}