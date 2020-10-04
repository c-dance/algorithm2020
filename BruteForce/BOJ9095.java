import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        
        for(int i = 0; i<cnt; i++){
            int n = sc.nextInt();
            int res = 0;
            for(int j = 0; j<=n/3; j++){
                for(int k = 0; k<=n/2; k++){
                    for(int t = 0; t<=n; t++){
                        if(3*j+2*k+t==n){
                            res += per(n,j,k,t);
                        }
                    }
                }
            }
            System.out.println(res); 
        }
    }

    public static int per(int n, int j, int k, int t){
        if(t==n || 3*j==n || 2*k==n){
            return 1;
        }else{
            return comb(j+k+t)/(comb(j)*comb(k)*comb(t));
        }
    }
    
    public static int comb(int num){
        int res = 1;
        if(num<2) return res;
        else{
            for(int i = 1; i<=num; i++){
                res = res*i;
            }
            return res;
        }
    }
    }

