import java.util.Enumeration;
import java.util.Scanner;

public class BinaryQuestion {
    //Given a base-10 integer,n, convert it to binary (base-2).
    // Then find and print the base-10 integer denoting the maximum
    // number of consecutive 1 's in n's binary representation.
    // When working with different bases, it is common to show the base as a subscript.
    public static void main(String[] args){
        //First convert into binary
        //Condition if i = 1 count
        //if i == 0 break
        Scanner sc = new Scanner(System.in);
       int i =0;
       int count = 0;
       int min =0;
        int n = sc.nextInt();
//        int binary[] = new int[100];
//        while(n!=0){
//            binary[i] = n%2;
//            n = n/2;
//            i++;
//        }
//        for(int j = i-1; j>=0; j--){
//            System.out.print(binary[j]);
//
//        }
        //System.out.println(count);
        while (n>0){
            if(n % 2 == 1){
                count++;
                if (count >= min){
                    min = count;
                }
            }else {
                count = 0;
            }
            n /= 2;
        }
        System.out.println(min);
    }
}
