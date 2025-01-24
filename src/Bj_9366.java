import java.io.*;
import java.util.*;

public class Bj_9366 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i=1; i<=t; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            String str;
            if (isEquilateral(arr)) {
                str = "equilateral";
            } else if (isIsosceles(arr)) {
                str = "isosceles";
            } else if (isScalene(arr)) {
                str = "scalene";
            } else {
                str = "invalid!";
            }

            sb.append("Case #").append(i).append(": ").append(str).append("\n");
        }
        System.out.print(sb);
    }

    private static boolean isEquilateral(int[] arr) {
        return arr[0] == arr[1] && arr[1] == arr[2];
    }

    private static boolean isIsosceles(int[] arr) {
        return (arr[0] == arr[1] && arr[0] * 2 > arr[2]) || (arr[1] == arr[2]);
    }

    private static boolean isScalene(int[] arr) {
        return arr[0] != arr[1] && arr[1] != arr[2] && arr[0] + arr[1] > arr[2];
    }
}
