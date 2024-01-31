import java.io.*;
import java.util.*;

public class Bj_14215 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		for (int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		if (arr[0] + arr[1] <= arr[2]) {
			arr[2] = arr[0] + arr[1] - 1;
		}
		
		System.out.print(arr[0] + arr[1] + arr[2]);
	}
}