package allQuestions;

import java.util.Scanner;

public class Native {
//    public void slidingWindow(int[] a , int K){
//        for(int i=0 ; i<a.length-K ; i++){
//            int max = a[i];
//            for(int j=1 ; j<=K ; j++){
//                if(a[i+j] > max)
//                    max = a[i+j];
//            }
//            System.out.print(max+" ");
//        }
//    }
//    public static void main(String[] args) {
//       // Scanner sc = new Scanner(System.in);
////        int  j = sc.nextInt();
////        int K = sc.nextInt();
////        int a[] = new int[j];
////        for(int i=0; i<j; i++){
////            a[i] = sc.nextInt();
////        }
//
//        int [] a = {1, 2, 3, 2, 4, 1, 5, 6, 1};
//        int K = 3;
//        Native s = new Native();
//        s.slidingWindow(a,K);
public void slidingWindow(int [] nums, int k){

    for (int i = 0; i <=nums.length - k ; i++) {
        int max = nums[i];
        for (int j = 1; j< k ; j++) {
            if(nums[i+j]>max)
                max = nums[i+j];
        }
        System.out.print(max + " ");
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  j = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[j];
        for(int i=0; i<j; i++){
            nums[i] = sc.nextInt();
        }
        Native s = new Native();
        s.slidingWindow(nums, k);
    }

    }


