import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
            int rem = a%10;
            System.out.print(rem);
            a = a/10;
        }
    }
}
