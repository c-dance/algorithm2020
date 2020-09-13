/* 

https://www.acmicpc.net/problem/10799
백준 10799 쇠막대기

1. '(' 열린 괄호를 만나면 쇠막대기가 시작한 것으로, 스택에 쌓는다. 
2.')' 닫힌 괄호를 만나면 두 가지 경우의 수가 있다.
 (2-1)이전의 것이 '('이면 레이저를 의미하는 것. ->  이전의 스택에서 '('를 빼고 
 잘려나간 막대기 갯수를 저장하는 변수에 스택에 쌓인 '('의 갯수를 더한다.
 (2-2)이전의 것이 ')'이면 막대기의 끝을 의미하는 것. -> 잘린 막대기의 나머지 부분이므로
 잘려나간 막대기 갯수를 저장하는 변수에 +1을 한다.


*/

import java.io.*;
import java.util.Stack;

public class stick_bj10799{

    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        Stack<String> stack = new Stack<>();
        int res = 0; 

        for(int i = 0; i<str.length;i++){
            if(str[i].equals("(")) stack.push("("); //막대기의 시작점이므로 스택에 삽입
            else{
                if(str[i-1].equals("(")){
                    stack.pop(); //레이저이므로 막대기 카운트에서 제외
                    res += stack.size(); //레이저로 막대기가 나뉘어졌으므로 첫 반쪽들의 갯수 저장
                }else{
                    stack.pop(); //막대기의 끝 지점이므로 스택에서 막대기 꺼내고, 
                    res += 1; //나머지 반쪽의 갯수 저장
                }
            }
        }

        bw.write(res+"\n");
        bw.flush();
        bw.close();
        br.close();  
    }

}