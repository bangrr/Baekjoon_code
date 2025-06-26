import java.io.*;
import java.util.*;

public class Bj_31925 {
    private static class Info {
        String name, jaehew, susang;
        int best, apc;
        boolean check;

        public Info(String name, String jaehew, String susang, int best, int apc, boolean check) {
            this.name = name;
            this.jaehew = jaehew;
            this.susang = susang;
            this.best = best;
            this.apc = apc;
            this.check = check;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Info> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String jaehew = st.nextToken();
            String susang = st.nextToken();
            int best = Integer.parseInt(st.nextToken());
            int apc = Integer.parseInt(st.nextToken());

            if (!Objects.equals(jaehew, "jaehak")) continue;
            if (Objects.equals(susang, "winner")) continue;
            if (best >= 1 && best <= 3) continue;

            list.add(new Info(name, jaehew, susang, best, apc, false));
        }

        int ans = Math.min(list.size(), 10);
        sb.append(ans).append("\n");

        list.sort(Comparator.comparing(o -> o.apc));
        for (int i = 0; i < ans; i++) {
            list.get(i).check = true;
        }

        list.sort(Comparator.comparing(o -> o.name));
        for (Info info : list) {
            if (info.check) sb.append(info.name).append("\n");
        }
        System.out.print(sb);
    }
}