import java.io.*;
 
public class Bj_1417 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int cnt = 0;
        int max = 0;
		for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }
        while (max >= arr[0]) {
            for (int i=1; i<n; i++) {
                if (arr[i] == max) {
                    arr[i]--;
                    arr[0]++;
                    cnt++;
                }
                if (arr[0] > max) {
                    break;
                }
            }
            max--;
        }
        System.out.print(cnt);
	}
}