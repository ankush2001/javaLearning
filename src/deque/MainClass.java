package deque;
//import java.util.*;
public class MainClass {
    public static void main(String[] args){
        //ArrayDeque<Integer> ad = new ArrayDeque<>();
    Mydeque<Integer> mydeque  = new Mydeque<>();
    mydeque.addToHead(55);
    mydeque.addToHead(66);
    System.out.println(mydeque.removeLast());
     }
}
