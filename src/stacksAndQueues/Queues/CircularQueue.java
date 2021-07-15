package stacksAndQueues.Queues;

public class CircularQueue {
    private int front;
    private int rear;
    private static final int Default_capacity = 10;
    private int max_Length ;
    private int[] arr;
    private int count;
     CircularQueue(){
        this(Default_capacity);
    }
    CircularQueue(int capacity){
//        if(capacity<=1){
//            throw new Exception("")
//        }
        this.arr = new int[capacity];
        this.count = 0;
        this.max_Length = capacity;
        this.front = 0;
        this.rear = capacity-1;
    }
    public boolean isFull(){
         return this.count == this.max_Length;
    }
    public boolean isEmpty(){
         return this.count==0;
    }
    public void enqueue(int data){
         if(!this.isFull()){
             this.rear =(this.rear+1)%this.arr.length;
             this.arr[this.rear] = data;
             this.count = count+1;
         }
    }

    public void dequeue(){
         if(!this.isEmpty()){
             this.front=(this.front+1)%this.arr.length ;
                this.count = this.count-1;
         }
    }
    public int getFront(){
         return this.arr[this.front];
    }

    public static void main(String[] args) {
        CircularQueue cc = new CircularQueue(5);

    }
}
