package stacksAndQueues.question;

import java.util.Stack;

public class BalancedParan {
    public static void main(String[] args) throws Exception {
        String str = "(())";
        Stack<Integer> stack = new Stack<>();
        System.out.println(isBalanced(str,stack));
    }
    public static boolean isBalanced(String str, Stack<Integer> stack) throws Exception {
        for (int i = 0; i < str.length(); i++)
        {
            char x = str.charAt(i);
            //System.out.println(x);
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push((int) x);
                continue;
            }
            // IF current current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            Integer check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());

    }
}
