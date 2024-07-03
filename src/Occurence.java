import java.util.*;
public class Occurence {
    public static void main(String[] args) {
    int a = 78734;
    int count=0;
    while(a>0)

    {
        int r = a % 10;
        if(r==7) {
            count++;

        }
        a=a/10;
    }
        System.out.println(count);
    }
}
