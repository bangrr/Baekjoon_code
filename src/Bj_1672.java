import java.io.*;
import java.util.*;

public class Bj_1672 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        for (int i = n-1; i > 0; i--) {
            arr[i-1] = decode(arr[i-1], arr[i]);
        }
        System.out.print(arr[0]);
    }

    private static char decode(char a, char b) {
        if (a == 'A') {
                 if (b == 'A') return 'A';
            else if (b == 'G') return 'C';
            else if (b == 'C') return 'A';
            else if (b == 'T') return 'G';
        } else if (a == 'G') {
                 if (b == 'A') return 'C';
            else if (b == 'G') return 'G';
            else if (b == 'C') return 'T';
            else if (b == 'T') return 'A';
        } else if (a == 'C') {
                 if (b == 'A') return 'A';
            else if (b == 'G') return 'T';
            else if (b == 'C') return 'C';
            else if (b == 'T') return 'G';
        } else if (a == 'T') {
                 if (b == 'A') return 'G';
            else if (b == 'G') return 'A';
            else if (b == 'C') return 'G';
            else if (b == 'T') return 'T';
        }
        return '\0';
    }
}