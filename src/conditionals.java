import java.util.*;

public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 20000;
        if(a==20000) {
            a += 3000;
            System.out.println(a);
        }
        else if(a>20000){
            a+=1500;
            System.out.println(a);
        }
        else{
            a+=1000;
            System.out.println(a);
        }
    }
}
