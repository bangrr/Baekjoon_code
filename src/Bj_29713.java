import java.io.*;
import java.util.*;

public class Bj_29713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for (int i=0; i<n; i++) {
            arr[s.charAt(i) - 'A']++;
        }

        int B = arr['B'-65];
        int R = arr['R'-65];
        int O = arr['O'-65];
        int N = arr['N'-65];
        int Z = arr['Z'-65];
        int E = arr['E'-65];
        int S = arr['S'-65];
        int I = arr['I'-65];
        int V = arr['V'-65];

        System.out.print(Math.min(B, Math.min(R/2, Math.min(O, Math.min(N, Math.min(Z, Math.min(E/2, Math.min(S, Math.min(I, V)))))))));
    }
}