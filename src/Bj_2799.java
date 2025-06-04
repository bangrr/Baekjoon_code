import java.io.*;
import java.util.*;

public class Bj_2799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        char[][] arr = new char[5*m+1][5*n+1];
        for (int i=0; i<arr.length; i++){
            String s = br.readLine();
            for (int j=0; j<s.length(); j++){
                arr[i][j] = s.charAt(j);
            }
        }

        int[] types = new int[5];
        for (int i=1; i<arr.length; i+=5){
            for (int j=1; j<arr[0].length; j+=5){
                int cnt = 0;
                for (int k = 0; k < 4; k++) {
                    if (arr[i + k][j] == '*') {
                        cnt++;
                    } else {
                        break;
                    }
                }
                types[cnt]++;
            }
        }

        for (int it : types) {
            sb.append(it).append(" ");
        }
        System.out.print(sb);
    }
}