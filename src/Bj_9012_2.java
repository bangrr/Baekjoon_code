import java.util.Scanner;

public class Bj_9012_2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      SStack stk = new SStack();
      int T = sc.nextInt();
      for (int i = 0; i < T; i++) {
         String inp = sc.next();
//         System.out.println(inp);
         boolean res = true;
         stk.init();

         for (int j = 0; j < inp.length(); j++) {
            if(inp.charAt(j) == '(') {
               stk.push('(');
            }else {
               if(stk.isEmpty()) {
                  res = false;
               }else {
                  stk.pop();
               }
            }
         }
         
         if(res == true && stk.isEmpty()) {
            System.out.println("YES");
         }else {
            System.out.println("NO");
         }
      }
      sc.close();

   }
}

class SStack {
   private char ar[];
   private int top;

   public SStack() {
      ar = new char[50];
      top = -1;
   }

   public void push(char c) {
      ar[++top] = c;
   }

   public void pop() {
      top--;
   }
   
   public boolean isEmpty() {
      if(top == -1) {
         return true;
      }else {
         return false;
      }
   }
   
   public void init() {
      top = -1;
   }
}