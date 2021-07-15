package vectorAndStacks;
import java.util.*;
public class SumOfEven {
    int n;
    void aa(int n) {
        this.n = n;
        int oddSum = 0, evenSum = 0;
        while (n > 0) {
            int a = n % 10;
            if (a % 2 == 0) {
                evenSum += a;
            } else {
                oddSum += a;
            }
            n = n / 10;
        }
        System.out.println(oddSum + " " + evenSum);
    }
            public static void main(String[] args){
		        Scanner scanner = new Scanner(System.in);
		        SumOfEven a = new SumOfEven();
		        a.aa(12345);
            }
}

