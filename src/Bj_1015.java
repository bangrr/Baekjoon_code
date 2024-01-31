import java.util.*;

public class Bj_1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];
        
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int p = 0;
        for (int i=1; i<=1000; i++) {
            for (int j=0; j<n; j++) {
                if (arr[j] == i) {
                    ans[j] = p++;
                }
            }
        }
        
        for (int i=0; i<n; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}