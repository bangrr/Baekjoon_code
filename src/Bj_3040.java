import java.io.*;
import java.util.*;

public class Bj_3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] arr = new int[9];
        int sum = 0;
        for (int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for (int i=0; i<8; i++) {
            for (int j=i+1; j<9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    for (int k=0; k<9; k++) {
                        if (k != i && k != j) {
                            sb.append(arr[k]).append("\n");
                        }
                    }
                    System.out.print(sb);
                    return;
                }
            }
        }
    }
}