
import java.util.Scanner;

public class Main{

    //greatest common factor
    public static int gcd(int a, int b){
        while(b!=0){ //0으로 나누어 떨어질 때까지 반복
                int tmp = a%b; //tmp : 나머지
                a=b; // a나누었으므로 b를 a의 자리에 위치
                b=tmp; 
        }
        return a;
    }

    //Least common multiple
    public static int lcm(int a, int b, int gcd){
        return (a*b)/gcd;
    }

    public static void main(final String[] args){

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(b>a){
            int tmp = a;
            a=b;
            b=tmp;
        }

        int res = gcd(a, b);
        System.out.println(res);
        System.out.println(lcm(a,b,res));

        scanner.close();

    }

}