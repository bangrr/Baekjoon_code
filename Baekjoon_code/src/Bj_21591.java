import java.util.Scanner;

public class Bj_21591 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wc = sc.nextInt();
        int hc = sc.nextInt();
        int ws = sc.nextInt();
        int hs = sc.nextInt();
        
        if (wc>ws+1&&hc>hs+1) System.out.print(1);
        else System.out.print(0);
        sc.close();
    }
}