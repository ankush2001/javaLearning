package stacksAndQueues.Queues;

import java.util.LinkedList;

public class QueueUsingLinkList {
    LinkedList<Integer> queue;
    public QueueUsingLinkList(){
        queue = new LinkedList<>();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public void enqueue(int data){
        queue.addLast(data);
    }

    public int dequeue(){
       return queue.removeFirst();
    }
    public int getFront(){
        return queue.getFirst();
    }
    public static void main(String[] args) {
        QueueUsingLinkList qq = new QueueUsingLinkList();
        for(int i=0 ; i<6 ; i++){
            qq.enqueue(i);
        }
        qq.dequeue();
        qq.dequeue();
        qq.enqueue(8);
        while (!qq.isEmpty()){
            System.out.print(qq.getFront());
            qq.dequeue();
        }

    }
}
