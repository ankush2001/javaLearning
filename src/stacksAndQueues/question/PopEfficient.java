package stacksAndQueues.question;

import java.util.LinkedList;
import java.util.Queue;

public class PopEfficient {
    public static void main(String[] args) {
            queues a = new queues();
            a.push(100);
            a.push(20);
            a.push(30);
            System.out.println(a.pop());
    }
    public static class queues {
            Queue<Integer> primary = new LinkedList<>();
            Queue<Integer> secondary = new LinkedList<>();
            void push(int item){
                secondary.add(item);
                while(!primary.isEmpty()){
                    secondary.add(primary.remove());
                }

                Queue<Integer> swap2 = new LinkedList<>();
                swap2 = primary;
                primary = secondary;
                secondary = swap2;

            }
            int pop(){
                int rv = primary.remove();
                return rv;
            }
        }
}
