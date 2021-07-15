package vectorAndStacks;
import java.util.Stack;
import java.util.Vector;
import java.util.*;
public class MainClass {

    public static void main(String[] args) throws Exception {
//        Vector<Integer> vector1= new Vector<>();//Thread safe and Synchronized
//        vector1.add(1);
        MyStack<Integer> stack = new MyStack<>();
//        stack.push(12);
//        stack.push(44);
//        stack.push(3);
//        stack.push(6);
        Scanner sc = new Scanner(System.in);
//        char a = sc.nextLine();
        for(int i=1 ; i<5 ; i++){
            stack.push(i);
            System.out.print(i);
        }
        System.out.println();
        int pooped = stack.pop();
        System.out.println(pooped);
    }

}
