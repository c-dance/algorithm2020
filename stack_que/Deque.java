import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;



public class Deque{
    public static void main(final String[] args) throws NumberFormatException, IOException {

        final Deque<Integer> deq = new ArrayDeque<>();
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            String[] cmd = br.readLine().split(" ");

            switch(cmd[0]){

                case "push_front":
                    deq.offerFirst(Integer.parseInt(cmd[1]));  
                    break;
                
                case "push_back":
                    deq.offerLast(Integer.parseInt(cmd[1]));  
                    break;
                
                case "pop_front":
                    System.out.println(deq.isEmpty()?-1:deq.pollFirst());
                    break;
                
                case "pop_back" :
                    System.out.println(deq.isEmpty()? -1 : deq.pollLast());
                    break;

                case "size" :
                    System.out.println(deq.size());
                    break;
                
                case "empty" :
                    System.out.println(deq.isEmpty()? 1:0);
                    break;
                
                case "front" : 
                    System.out.println(deq.isEmpty()? -1:deq.peekFirst());
                    break;

                case "back" :
                    System.out.println(deq.isEmpty()? -1:deq.peekLast());
                    break;
     
            }

            
        }
    }
}