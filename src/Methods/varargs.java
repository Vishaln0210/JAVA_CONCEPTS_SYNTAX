package Methods;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
fun(9, 6, 6, 7, 5, 4, 3, 2);
    }
    static void fun(int...v){ //internally it taking it has array of integrs as arguments
        System.out.println(Arrays.toString(v));

    }
}
