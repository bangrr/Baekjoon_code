import java.util.*;
import java.io.*;

public class Bj_26562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String[] arr = new String[]{"Franklin","Grant","Jackson","Hamilton","Lincoln","Washington"};
        int[] cost = new int[]{100,50,20,10,5,1};

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                for (int j=0; j<6; j++) {
                    if (arr[j].equals(s)) {
                        sum += cost[j];
                        break;
                    }
                }
            }
            sb.append("$").append(sum).append("\n");
        }
        System.out.print(sb);
    }
}