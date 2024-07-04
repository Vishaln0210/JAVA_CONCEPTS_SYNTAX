import java.util.*;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean ans = isprime(n);
        System.out.print(ans);
    }
        static boolean isprime(int n){


        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
    }


