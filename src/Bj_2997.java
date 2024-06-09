import java.io.*;
import java.util.*;

public class Bj_2997 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int b = arr[2] - arr[1];
        int a = arr[1] - arr[0];
        if (a < b) {
            System.out.print(arr[1] + a);
        } else if (a > b){
            System.out.print(arr[1] - b);
        } else {
            System.out.print(arr[2] + a);
        }
    }
}