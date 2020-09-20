
import java.io.IOException;
import java.util.Scanner;

public class Factorial{

    public static void main(String[] args)throws IOException{

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = 1;

        for(int i = 1;i<=num;i++){
            res *= i;
        }
        System.out.println(res);
        scanner.close();

    }
}