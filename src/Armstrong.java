import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isArmstrong(n));
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum+= rem*rem*rem;
            n/=10;
        }
        return original == sum;
    }
}
