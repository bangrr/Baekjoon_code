import java.io.*;
import java.util.*;
 
public class Bj_30236 {
   // 입출력 메소드
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static StringBuilder sb = new StringBuilder();
   static StringTokenizer st;
 
   // main 메소드
   public static void main(String[] args) throws IOException {
      int t = Integer.parseInt(br.readLine());
      while (t-- > 0) {
         int n = Integer.parseInt(br.readLine());
         int p = 0;
         st = new StringTokenizer(br.readLine());
         for (int i=0; i<n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (++p == a) {
               p = a+1;
            }
         }
         System.out.println(p);
      }
   }
}