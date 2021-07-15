package allQuestions;

public class Power {
    public static void main(String[] args) {
    int a=3;
    int n=2;
    System.out.println(Power(a,n));
    }
    public static int Power(int a , int n) {
    if(n==0){
        return 1;
    }
    int ans = Power(a,n/2);
        if(n%2==0){
        return ans*ans;
        }else{
         return  ans*ans*a;
        }
    }

}
