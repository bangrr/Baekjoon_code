import java.io.*;
import java.util.*;

public class Bj_31775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String a = br.readLine();
        String s = br.readLine();
        String d = br.readLine();
        char[] arr = new char[3];
        arr[0] = a.charAt(0);
        arr[1] = s.charAt(0);
        arr[2] = d.charAt(0);
        Arrays.sort(arr);
        if (arr[0] == 'k' && arr[1] == 'l' && arr[2] == 'p') {
            System.out.print("GLOBAL");
        } else {
            System.out.print("PONIX");
        }
    }
}