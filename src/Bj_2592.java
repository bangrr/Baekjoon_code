import java.io.*;

public class Bj_2592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[101];
        int sum = 0;
        for (int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[num/10]++;
        }
        int max = 0;
        int ans = 0;
        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ans = i * 10;
            }
        }
        sb.append(sum / 10).append("\n").append(ans);
        System.out.print(sb);
    }
}