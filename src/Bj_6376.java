import java.io.*;

public class Bj_6376 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[10];
        arr[0] = 1;
        for (int i = 1; i < 10; i++) {
            arr[i] = arr[i-1] * i;
        }
        double[] sum = new double[10];
        sum[0] = 1;
        for (int i = 1; i < 10; i++) {
            sum[i] = sum[i-1] + (double)1/arr[i];
        }
        sb.append("n e\n- -----------\n");
        for (int i = 0; i < 10; i++) {
            String format = "%.0f\n";
            if (i == 2) format = "%.1f\n";
            else if (i > 2) format = "%.9f\n";
            sb.append(i).append(" ").append(String.format(format, sum[i]));
        }
        System.out.print(sb);
    }
}