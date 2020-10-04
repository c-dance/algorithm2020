import java.util.Scanner;


public class BOJ_1748 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int len = number.length(); //3
        int num = Integer.parseInt(number); //120
        int res = 0; 
        
        for(int i = len-1;i>0;i--){
            res += i*(Math.pow(10,i) - Math.pow(10,i-1));
        }
        res += len*(num+1-Math.pow(10,len-1));

        System.out.println(res);

    }
}
