import java.io.*;
import java.util.StringTokenizer;

public class bj_1978 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine()); // 받는 숫자 쌍의 갯수
        int answer = 0; //소수의 갯수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");//입력받은 수 도출
        
        for(int i = 0;i<cnt;i++){
            int num = Integer.parseInt(st.nextToken());
            int res = 0;
            for(int i = 1 ; i<num+1 ; i++){
                if(num%i==0) res++;
                if(res>2) break; //나누어 떨어지는 수의 갯수가 2개 이상이면 소수가 아니다. 
            }
        }
            if(res==2) answer++;
        
        System.out.println(answer);
        br.close();
    }

}




        
