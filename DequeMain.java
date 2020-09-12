import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class DequeMain {
    public static void main(String[] args) throws Exception {

       Scanner sc = new Scanner(System.in);
       String cmd = "";
       Deque<Integer> que = new ArrayDeque<Integer>();
       int cnt = sc.nextInt();

       for(int i = 0;i<cnt;i++){
           cmd = sc.next();
           if(cmd.equals("push")){
               que.add(sc.nextInt());
           }else if(cmd.equals("pop")){
               System.out.println(que.isEmpty()? -1:que.poll());
           }else if(cmd.equals("size")){
               System.out.println(que.size());
           }else if(cmd.equals("empty")){
               System.out.println(que.isEmpty()? 1 :0);
           }else if(cmd.equals("front")){
               System.out.println(que.isEmpty()? -1 : que.peek());
           }else if(cmd.equals("back")){
               System.out.println(que.isEmpty()? -1 : que.peekLast());
           }
       }
        }
    }