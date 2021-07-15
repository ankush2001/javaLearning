package recursion.question;

import java.util.Scanner;

public class TowerOfhanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n,'A','B','C');
    }
    public static void toh(int n ,char ti1d, char ti2d , char ti3d){
        if(n==0){
            return;
        }
        toh(n-1,ti1d,ti3d,ti2d);
        System.out.println("Moving ring "+n+" from "+ti1d +" to "+ti2d);
        toh(n-1,ti3d,ti2d,ti1d);
    }
}
