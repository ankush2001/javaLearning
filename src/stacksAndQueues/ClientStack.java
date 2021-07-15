package stacksAndQueues;

public class ClientStack {
    public static void main(String [] args) throws Exception{
        StacksUsingArrays ss = new StacksUsingArrays(10);

        ss.push(5);
        ss.push(10);
        ss.push(15);
        ss.push(20);

        ss.display();
        System.out.println(ss.pop());
    }
}
