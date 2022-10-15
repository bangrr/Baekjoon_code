import java.util.*;
 
public class Bj_25755 { 
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char w = sc.next().charAt(0);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.next().charAt(0);
                if (arr[i][j] == '2') arr[i][j] = '5';
                else if (arr[i][j] == '5') arr[i][j] = '2';
                else if (arr[i][j] == '1') arr[i][j] = '1';
                else if (arr[i][j] == '8') arr[i][j] = '8';
                else arr[i][j] = '?';
            }
        }
        if (w=='D' || w=='U') {
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    sb.append(arr[n-1-i][j]+" ");
                }
                sb.append("\n");
            }
        } else {
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    sb.append(arr[i][n-1-j]+" ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
        sc.close();
    } 
}