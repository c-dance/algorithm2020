import java.io.*;
import java.util.Stack;

//백준 단어뒤집기2 : https://www.acmicpc.net/problem/17413

public class WordReverse2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine()+"\n"; // \n :한 줄 읽음.구분자
        char[] array = s.toCharArray();
        int len = array.length;

        Stack<Character> stack = new Stack<>();
        boolean tagOpen = false;
        
        for(int i = 0;i<len;i++){
            char c = array[i];
            if(c=='<') tagOpen = true;
            if(tagOpen || c==' ' || c=='\n'){
                while(!stack.empty()){
                    bw.write(stack.pop()); //stack에 있는 것 거꾸로 출력. stack 비움.
                }
                if(c!='\n') bw.write(c); //문장 끝일 때는 pass.
            }else{
                stack.push(c); //tag닫혔을 때, 공백이 아닐 때, 끝이 아닐때는  stack으로.
            }
            if(c=='>') tagOpen = false;
        }
        bw.flush();
        bw.close();

     }
}       
    
    


