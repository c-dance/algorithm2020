import java.io.*;
import java.util.Arrays;

public class BOJ_2309 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int len = 0;
        for(int i = 0; i<9;i++){
            arr[i] = Integer.parseInt(br.readLine());
            len += arr[i];
        }
        Arrays.sort(arr);

        len -= 100;

        boolean found = false;
        for(int i = 0; i<8; i++){
            if(found) break;
            for(int j = 1; j<9; j++){
                if(i==j) continue;
                if(arr[i]+arr[j]==len){
                    arr[i]=0;
                    arr[j]=0;
                    found = true;
                    break;
                }
            }
        }

        for(int i = 0; i<9; i++){
            if(arr[i]==0) continue;
            else System.out.println(arr[i]);
        }
    }
}
