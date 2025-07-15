import java.io.*;

public class Bj_6794 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 3, 2, 2, 1, 1};
        System.out.print(arr[n]);
    }
}