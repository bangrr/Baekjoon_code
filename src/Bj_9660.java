import java.io.*;

public class Bj_9660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine()) - 1;
        int[] arr = new int[]{1, 0, 1, 1, 1, 1, 0, 1};
        System.out.print(arr[(int) (n % 7)] == 1 ? "SK" : "CY");
    }
}