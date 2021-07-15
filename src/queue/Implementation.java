package queue;


import queue.LinkedList22.Node;

public class Implementation<E> {
    private Node<E> front,rear;
    public void enqueue(E e){

        Node<E> toAdd = new Node(e);
        if(front == null){
            front = rear = toAdd;
            return;
        }
        rear.next = toAdd;
        rear = rear.next;

    }
    public E dequeue(){
        if(front == null){
            return null;
        }
        Node<E> temp = front;
         front = front.next;
         if(front == null){
             rear = null;
         }
         return temp.data;
    }
}
