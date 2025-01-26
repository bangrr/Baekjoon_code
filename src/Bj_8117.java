import java.io.*;
import java.util.*;

public class Bj_8117 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            list.add(n);
        }

        int len = list.size();
        for (int i=0; i<len; i++) {
            int a = list.get(i);
            for (int j=i+1; j<len; j++) {
                int b = list.get(j);
                for (int k=j+1; k<len; k++) {
                    int c = list.get(k);
                    if (a + b > c && b + c > a && c + a > b) {
                        System.out.print(a + " " + b + " " + c);
                        return;
                    }
                }
            }
        }
        System.out.print("NIE");
    }
}
