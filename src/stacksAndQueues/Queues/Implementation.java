package stacksAndQueues.Queues;

public class Implementation {
   private int front;
    private int rear;

    private int maxLength;
    private int arr[];
    public static final int Default_Capacity = 10;
    Implementation() throws Exception {
        this(Default_Capacity);
    }
    public Implementation(int capacity)throws Exception{
        if(capacity<=0){
            throw new Exception("Invalid capacity");
        }
        this.arr = new int[capacity];
       // this.count=0;
        this.front=0;
        this.rear=0;
        this.maxLength=capacity;
    }
    public void enqueue(int data)throws Exception{
        if(rear==maxLength){
         throw new Exception("Queue is full");
        }
        arr[rear] = data;
        rear++;
        return;
    }
    public void dequeue() throws Exception{
        if(front<=0){
            throw new Exception("Queue is Empty");
        }
        int item = arr[front];
        arr[front] = 0;
        if(front==rear){
            front--;
            rear--;
        }else {
            front++;
        }
        return;
    }
    public void display(){
        for(int i=this.front ;i<this.rear ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) throws Exception {
        Implementation q  = new Implementation(8);
        q.dequeue();

        q.display();
    }


}
