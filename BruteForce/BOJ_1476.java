import java.util.Scanner;
import java.io.*;

public class BOJ_1476 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int E = 15;
        int S = 28;
        int M = 19;
        int[] years = new int[3];
        for(int i = 0; i<3;i++){
            years[i] = sc.nextInt();
        }
       
        int i = 1;
        while(true){
            if((i-years[0])%E ==0 && (i-years[1])%S ==0 & (i-years[2])%M ==0)break;
            i++;
        }
        System.out.println(i);
    }
}

