package Arrays;
import java.util.*;
public class reversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, n);
    }
    static void reverse(int[] arr, int n){

        int start = 0;
        int end = n-1;
        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

            }
        System.out.println(Arrays.toString(arr));
        }
    }
