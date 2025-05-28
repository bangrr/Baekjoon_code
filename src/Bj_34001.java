import java.io.*;
import java.util.*;

public class Bj_34001 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int a = n < 200 ? 0 : n < 210 ? 500 : n < 220 ? 300 : 100;
        int b = n < 210 ? 0 : n < 220 ? 500 : n < 225 ? 300 : 100;
        int c = n < 220 ? 0 : n < 225 ? 500 : n < 230 ? 300 : 100;
        int d = n < 225 ? 0 : n < 230 ? 500 : n < 235 ? 300 : 100;
        int e = n < 230 ? 0 : n < 235 ? 500 : n < 245 ? 300 : 100;
        int f = n < 235 ? 0 : n < 245 ? 500 : n < 250 ? 300 : 100;

        int g = n < 260 ? 0 : n < 265 ? 500 : n < 270 ? 300 : 100;
        int h = n < 265 ? 0 : n < 270 ? 500 : n < 275 ? 300 : 100;
        int i = n < 270 ? 0 : n < 275 ? 500 : n < 280 ? 300 : 100;
        int j = n < 275 ? 0 : n < 280 ? 500 : n < 285 ? 300 : 100;
        int k = n < 280 ? 0 : n < 285 ? 500 : n < 290 ? 300 : 100;
        int l = n < 285 ? 0 : n < 290 ? 500 : n < 295 ? 300 : 100;
        int m = n < 290 ? 0 : n < 295 ? 500 : n < 300 ? 300 : 100;

        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
        System.out.print(g+" "+h+" "+i+" "+j+" "+k+" "+l+" "+m);
    }
}