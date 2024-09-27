import java.io.*;
import java.util.*;

public class Bj_23968 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bubbleSort(arr, k);
    }

    private static void bubbleSort(int[] arr, int k) {
        int cnt = 0;
        for (int last = arr.length - 1; last > 0; last--) {
            for (int i = 0; i < last; i ++) {
                if (arr[i] > arr[i+1]) {
                    cnt++;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    if (cnt == k) {
                        System.out.print(arr[i] + " " + arr[i+1]);
                        return;
                    }
                }
            }
        }
        if (cnt < k) {
            System.out.print(-1);
        }
    }
}