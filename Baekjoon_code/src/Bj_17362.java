import java.util.*;

public class Bj_17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = {1,2,3,4,5,4,3,2};
        System.out.print(a[(n-1)%8]);
        sc.close();
    }
}