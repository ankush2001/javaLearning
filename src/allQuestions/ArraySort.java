package allQuestions;

public class ArraySort {
    public static void sort012(int a[], int n) {
        int i;
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }

            if (a[i] == 1) {
                count1++;
            }
            if (a[i] == 2) {
                count2++;
            }
        }
        i = 0;
        while (count > 0) {
            a[i++] = 0;
            count--;
        }
        while (count1 > 0) {
            a[i++] = 1;
            count1--;
        }

        while (count2 > 0) {
            a[i++] = 2;
            count2--;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int a[] = {0,1,0};
        sort012(a,n);
        for(int i=0 ; i<n ; i++){
            System.out.print(a[i]+" ");
        }
    }
}
