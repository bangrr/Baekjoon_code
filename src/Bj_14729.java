import java.io.*;
import java.util.*;
 
public class Bj_14729 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        ArrayList<Double> list = new ArrayList<>();
        double[] arr = new double[7];
        Arrays.fill(arr, 100000.000);
        double tmp;
        for (int i=0; i<n; i++) {
            double d = Double.parseDouble(br.readLine());
            for (int j=0; j<7; j++) {
                if (d < arr[j]) {
                    tmp = arr[j];
                    arr[j] = d;
                    d = tmp;
                }
            }
        }
        for (int i=0; i<7; i++) sb.append(String.format("%.3f", arr[i])).append("\n");
        System.out.print(sb);
	}
}