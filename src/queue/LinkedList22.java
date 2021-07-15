package queue;

public class LinkedList22<E> {
       private Node<E> head;
        public void add(E data){
            Node<E> toAdd = new Node<E>(data);
            if (isEmpty()){
                head = toAdd;
                return;
            }
            Node<E> temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = toAdd;
        }
        void  print() {
            Node<E> temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
       public boolean isEmpty(){
            return head==null;
        }
        public E removeLast() throws Exception{
            Node<E> temp = head;
            if (temp == null)
            {
                throw new Exception("Cannot remove last element from empty stack");
            }
            if(temp.next == null){
                Node<E> toRemove = head;
                head = null;
                return toRemove.data;
            }
            while (temp.next.next != null){
                temp = temp.next;
            }
            Node<E> toRemove = temp.next;
            temp.next = null;
            return  toRemove.data;
        }
        public E getLast() throws Exception{
            Node<E> temp = head;
            if (temp == null)
            {
                throw new Exception("Cannot peek last element from empty stack");
            }
            while (temp.next != null){
                temp = temp.next;
            }

            return  temp.data;
        }
            public void removeAlternate(){
                Node<E> current = head;
                Node<E> prev = head;
                if(head == null)
                return;
                else if(current.next == null)
                    return;
                while(current != null && current.next != null){
                    prev.next = current.next.next;
                    current = current.next;
                    prev = prev.next;
                }
            }
//            public boolean identical(Node<E> head1 , Node<E> head2){
//
//            }
        public Node<E> removeDuplicates() {
            Node<E> current = head;
             while(current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;}
            else{

                current = current.next;}
                     }
                return head;
                }
      public void addFirst(E item){
            Node<E> nn = new Node<E>(item);
          if (isEmpty()){
              head = nn;
              return;
          }
          nn.data = item;
          nn.next = head;
          head = nn;

      }
      public void addLast(E item){

          Node<E> nn = new Node<>(item);
          if(head==null){
               head = new Node<E>(item);
               return;
           }
          nn.next = null;
          Node<E> last = head;
          while(last.next !=null){
              last = last.next;
          }
        last.next = nn;
          return;
      }
      public E getFirst() throws Exception{
            Node<E> temp = head;
        if(temp == null){
            throw new Exception("Empty");
        }
          return  temp.data;
      }

//      public E getAt(E idx) throws Exception{
//            if(isEmpty()){
//                throw new Exception("ll is empty");
//            }
//            Node<E> nn = new Node<>(idx);
//            for(int i=0 ; i< ; i++){
//
//            }
//            return nn.data;
//      }
   public Node<E> reverse(){
            Node<E> ahead = null;
            Node<E> curr = head.next;
            Node<E> prev = null;
            while(curr != null){
             ahead = curr.next;
             curr.next = prev;
             prev = curr;
             curr = ahead;
            }
            head = prev;
    return  prev;
   }
   public Node<E> reverseWise(){
    return null;
   }

    public static class Node<E> {
        E data;
        Node<E> next;
       public  Node(E data){
            this.data = data;
            next = null;
        }
    }
}
