import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for(int i=0; i<n1; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for(int i=0; i<n2; i++) {
            a2[i] = sc.nextInt();
        }
        CustomSort.mergeSort(a1);
        CustomSort.mergeSort(a2);
        CustomSort.display(a1);
        CustomSort.display(a2);
        int res[] = CustomSort.mergeSorted(a1, a2);
        CustomSort.display(res);
    }
}
