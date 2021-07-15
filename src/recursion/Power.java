package recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(Pow(2,5));
    }
    public static int Pow(int a,int x){
        if(x==0){
            return 1;
        }
        int Pw1 = Pow(a,x-1);
        int pn = a*Pw1;;
        return pn;
    }
}
