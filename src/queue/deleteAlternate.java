package queue;

import java.util.Scanner;

public class deleteAlternate {
    public static void main(String[] args){
        LinkedList22<Integer> linkedList22 = new LinkedList22<>();
      Scanner sc = new Scanner(System.in);
     int b = sc.nextInt();

        while (b-- > 0) {
            int a = sc.nextInt();
            linkedList22.add(a);


        }
        linkedList22.removeDuplicates(); // re do it

        linkedList22.print();


    }
}
