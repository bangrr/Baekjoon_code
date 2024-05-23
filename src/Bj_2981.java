import java.util.*;
import java.io.*;

public class Bj_2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int[] sub = new int[n-1];
        for (int i=1; i<n; i++) {
            sub[i-1] = arr[i]-arr[i-1];
        }

        int gcd = sub[0];
        for (int i=1; i<sub.length; i++) {
            gcd = getGcd(gcd, sub[i]);
        }

        printAnswer(gcd, sb);
        System.out.print(sb);
    }

    private static int getGcd(int a, int b) {
        if (b == 0) return a;
        else return getGcd(b, a % b);
    }

    private static void printAnswer(int min, StringBuilder sb) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=2; i<=Math.sqrt(min); i++) {
            if (min % i == 0) {
                list.add(i);
                if (min / i != i) {
                    list.add(min / i);
                }
            }
        }
        list.add(min);
        Collections.sort(list);
        for (int it : list) {
            sb.append(it).append(" ");
        }
    }
}