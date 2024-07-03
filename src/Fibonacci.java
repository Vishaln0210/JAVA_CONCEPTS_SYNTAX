import java.sql.SQLOutput;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(num>=count){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.print(b + ", ");
        }
    }
}
