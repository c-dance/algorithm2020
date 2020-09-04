import java.util.Scanner;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int cnt = sc.nextInt();
        String cmd = "";

        for(int i=0;i<cnt;i++){
            cmd = sc.next();
            String scmd = cmd.split(" ")[0];
            if(scmd.equals("push")){
                stack.push(sc.nextInt());
            }else if(scmd.equals("pop")){
                int n = stack.isEmpty()? -1 : stack.pop();
                System.out.println(n);
            }else if(scmd.equals("size")){
                System.out.println(stack.size());
            }else if(scmd.equals("empty")){
                System.out.println(stack.isEmpty()? 1 : 0);
            }else if(scmd.equals("top")){
                System.out.println(stack.isEmpty()?-1 : stack.peek());
            }

        }
    }
}