import java.io.*;
import java.util.*;
 
public class Bj_25757 { 
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int n = Integer.parseInt(st.nextToken());
        String c = st.nextToken();
        List<String> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            list.add(br.readLine());
        }
        Set<String> set = new HashSet<>(list);
 
        int d=0;
        if (c.equals("Y")) d=1;
        if (c.equals("F")) d=2;
        if (c.equals("O")) d=3;
        System.out.print(set.size()/d);
    } 
}