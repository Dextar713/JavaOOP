import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void reverse(int a[]) {
        int n = a.length;
        for(int i=0; i<n/2; i++) {
            int temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter int between 0 and 5");
            n = sc.nextInt();
        } while (n < 0 || n > 5);
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
