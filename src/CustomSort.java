public class CustomSort {
    public static void recSort(int a[], int l, int r) {
        if(l==r) {
            return;
        }
        int mid = (l+r)/2;
        recSort(a, l, mid);
        recSort(a,mid+1, r);
        int temp[] = new int[r-l+1];
        int id1 = l, id2 = mid+1, id0 = 0;
        while(id1<=mid&&id2<=r) {
            if(a[id1]<a[id2]) {
                temp[id0++] = a[id1++];
            } else {
                temp[id0++] = a[id2++];
            }
        }
        while(id1<=mid) {
            temp[id0++] = a[id1++];
        }
        while(id2<=r) {
            temp[id0++] = a[id2++];
        }
        for(int i=0; i<=r-l; i++) {
            a[l+i] = temp[i];
        }
    }

    public static void mergeSort(int a[]) {
        recSort(a, 0, a.length - 1);
    }

    public static int[] mergeSorted(int a1[], int a2[]) {
        int n1 = a1.length, n2 = a2.length, n = n1+n2;
        int res[] = new int[n];
        int id1 = 0, id2 = 0, id0 = 0;
        while(id1<n1&&id2<n2) {
            if(a1[id1]<a2[id2]) {
                res[id0++] = a1[id1++];
            } else {
                res[id0++] = a2[id2++];
            }
        }
        while(id1<n1) {
            res[id0++] = a1[id1++];
        }
        while(id2<n2) {
            res[id0++] = a2[id2++];
        }
        return res;
    }

    public static void display(int a[]) {
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
