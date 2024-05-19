import java.io.*;
import java.util.*;

public class Bj_2535 {
    static class Student {
        int a, b, c;

        public Student(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            students.add(new Student(a, b, c));
        }
        students.sort((o1, o2) -> o2.c - o1.c);
        int cnt = 0;
        int[] arr = new int[3];
        for (int i = 0; i < n; i++) {
            if (arr[0] == arr[1] && arr[1] == students.get(i).a) continue;
            System.out.println(students.get(i).a + " " + students.get(i).b);
            arr[cnt++] = students.get(i).a;
            if (cnt == 3) return;
        }
    }
}