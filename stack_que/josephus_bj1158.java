/* https://www.acmicpc.net/problem/1158
백준 1158 요세푸스 문제 */

/* 요세푸스 문제는 다음과 같다.

1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
이제 순서대로 K번째 사람을 제거한다. 
한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 
원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 
예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.

N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오. */


import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;

public class josephus_bj1158{

    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int cnt = Integer.parseInt(str[0]);
        int num = Integer.parseInt(str[1]);

        Deque<Integer> que = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();


        for(int i=1;i<cnt+1;i++){
            que.offer(i);
        }

        sb.append("<");
        while(que.size()!=1){

            for(int i = 1; i<num;i++){
                que.offer(que.remove());
            }
            sb.append(que.poll()+", ");

        }
        sb.append(que.poll()+">");

        bw.write(sb.toString() +"\n");
        bw.flush();
        bw.close();
        br.close();

    }

}
