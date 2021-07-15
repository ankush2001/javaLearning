package stacksAndQueues;

public class ReverrsingAStack {
    public static void main(String[] args) throws Exception{
        StacksUsingArrays stack = new StacksUsingArrays(5);
        StacksUsingArrays helper = new StacksUsingArrays(5);
        for(int i=1 ; i<=5 ; i++ ){
            stack.push(i*10);
        }
        System.out.println("before reversing the Stack is");
        stack.display();
        reverse(stack,helper,0);
        System.out.println("After reversing new Stack is ");
        stack.display();
    }
    public static void reverse(StacksUsingArrays stack , StacksUsingArrays helper, int index) throws Exception {
       if(stack.isEmpty()){
        return;
       }
        int item= stack.pop();

        reverse(stack,helper,index+1);
        helper.push(item);
        if(index == 0){
            while(!helper.isEmpty()){
                stack.push(helper.pop());
            }
        }

    }
}
