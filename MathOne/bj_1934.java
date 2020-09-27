import java.io.*;
import java.util.StringTokenizer;

public class bj_1934 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine()); // 받는 숫자 쌍의 갯수

        for(int i = 0;i<cnt;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = gcd(a,b);
            System.out.println((a*b)/c);
        }
        br.close();
    }

    //gcd : 나머지가 0이 될 때 까지의 몫을 구한다. 
    public static int gcd(int a, int b){ 
        while(b>0){
           int res = a%b;
           a = b; //처음에 작은 수를 큰 수로 나누었더라도, 위치가 서로 바뀜으로 연산 가능
           b = res; //나머지가 0이 될 때, 멈춤
        }
        return a;
    }
}




        
