import java.io.*;

public class Bj_11195 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int odd = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 1) {
                odd++;
            }
        }
        System.out.print(Math.max(0, odd - 1));
    }
}