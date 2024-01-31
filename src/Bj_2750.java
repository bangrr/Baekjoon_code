import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj_2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
//		Arrays.sort(arr);
		// sort() 메소드 안쓰고 버블 정렬 구현
		for (int i=0; i<n-1; i++) {
			for (int j=0; j<n-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		// 출력 부분
		for (int i=0; i<n; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.print(sb.toString());
	}
}