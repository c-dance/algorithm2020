
import java.io.IOException;
import java.util.Scanner;

public class primeNum{

    public static void main(String[] args)throws IOException{

        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int prime = 0; 
     
        for(int i =0; i<cnt;i++){
            int num = scanner.nextInt();
            int res = 0;
            for(int j = 1; j<num+1;j++){
                if(num%j==0) res++;
            }
            if(res==1) prime++;
        }//for
        scanner.close();
        System.out.println(prime);
    }
}