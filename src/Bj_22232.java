import java.io.*;
import java.util.*;

public class Bj_22232 {
    static class Pair {
        String name, ext;

        public Pair(String name, String ext) {
            this.name = name;
            this.ext = ext;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Pair> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), ".");
            String name = st.nextToken();
            String ext = st.nextToken();
            list.add(new Pair(name, ext));
        }

        Set<String> set = new HashSet<>();
        for (int i=0; i<m; i++) {
            String osExt = br.readLine();
            set.add(osExt);
        }

        list.sort((o1, o2) -> {
            if (o1.name.equals(o2.name)) {
                if (set.contains(o1.ext) && !set.contains(o2.ext)) {
                    return -1;
                } else if (!set.contains(o1.ext) && set.contains(o2.ext)) {
                    return 1;
                } else {
                    return o1.ext.compareTo(o2.ext);
                }
            } else {
                return o1.name.compareTo(o2.name);
            }
        });
        for (Pair p : list) {
            sb.append(p.name).append(".").append(p.ext).append("\n");
        }
        System.out.print(sb);
    }
}