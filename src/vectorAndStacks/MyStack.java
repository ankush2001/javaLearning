package vectorAndStacks;

import queue.LinkedList22;

public class MyStack<E> {

     LinkedList22<E> ll = new LinkedList22<>();

    void push(E e){

         ll.add(e);
    }
    E pop() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("Popping from an empty Stack");
        }
        return ll.removeLast();
    }
    E peek()throws Exception{
        if(ll.isEmpty()){
            throw new Exception("Peeking from an empty Stack");
        }
            return ll.getLast();
    }
}
