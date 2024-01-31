import java.io.*;
import java.util.*;

public class Bj_27272 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] arr = new int[4];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.println(arr[0]*arr[1] + arr[2]*arr[3]);
	}
}