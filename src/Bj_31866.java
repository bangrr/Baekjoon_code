import java.io.*;
import java.util.*;

public class Bj_31866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (a == 1 || a == 3 || a == 4) a = -1;
        if (b == 1 || b == 3 || b == 4) b = -1;
        char c;
        if (a==0&&b==5||a==2&&b==0||a==5&&b==2) c='<';
        else if (b==0&&a==5||b==2&&a==0||b==5&&a==2) c='>';
        else if (a==b) c='=';
        else c=a>b?'>':'<';

        System.out.print(c);
    }
}