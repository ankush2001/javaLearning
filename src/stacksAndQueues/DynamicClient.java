package stacksAndQueues;

public class DynamicClient {
    public static void main(String[] args) throws Exception {
        StacksUsingArrays ss = new DynamicStack(5);
        ss.push(55);
        ss.push(65);
        ss.push(75);
        ss.push(85);
        ss.push(95);
        ss.display();
        ss.push(88);
        ss.display();
        System.out.println(ss.top());
    }
}
