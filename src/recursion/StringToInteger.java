package recursion;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args){
        //System.out.println(Answer("1234",4));

        int arr[] = {3,2,1,2,3,1};
        int M=2;
       int output[] =  IndicesProblem(arr,M,0,0);
       for(int i=0 ; i < output.length ; i++){
           System.out.println(output[i]);
       }
    }
    public static int Answer(String str , int n){
        if(n==1){
            return str.charAt(0) - '0';
        }
        return (10*Answer(str,n-1) + str.charAt(n-1) - '0');
    }
    public static int[] IndicesProblem(int arr[] , int M , int indices ,int size){
       if(indices == arr.length){
           return new int[size];
       }
       if(arr[indices] == M){
           int[] iarr = IndicesProblem(arr,M,indices+1,size+1);
           iarr[size] = indices;
           return iarr;
       }else{
           int[] iarr =IndicesProblem(arr,M,indices+1,size);
           return iarr;
       }

    }

}
