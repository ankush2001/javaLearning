package bracketQuestion;
import java.util.*;
public class Solution {

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int contains = sc.nextInt();


            while(contains --> 0){
                boolean isBalanced = true;
                String brackets = sc.next();
                Stack<Character> stack = new Stack<Character>();

                for(int i=0 ; i<brackets.length() ; i++){
                   char ch = brackets.charAt(i);
                    if(ch == '{' || ch == '[' || ch == '('){
                    stack.push(ch);
                    continue;
                }
                    if(stack.isEmpty()){
                        isBalanced = false;
                        break;
                    }

                    if(ch == '}'){
                       if( stack.peek() == '{' ){
                           stack.pop();
                       }else{
                           isBalanced = false;

                       }
                    }

                    if(ch == ']'){
                       if( stack.peek() == '[' ){
                           stack.pop();
                       }else{
                           isBalanced = false;

                       }
                    }

                    if(ch == ')'){
                       if( stack.peek() == '(' ){
                           stack.pop();
                       }else{
                           isBalanced = false;

                       }
                    }

                }
                if(!stack.isEmpty()){
                    isBalanced = false;
                }
                if(isBalanced){
                    System.out.println("Yes");
                }else
                    System.out.println("No");

            }

    }
}
