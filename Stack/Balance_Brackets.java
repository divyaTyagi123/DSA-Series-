import java.util.*;

public class Balance_Brackets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch== '{' || ch=='['){
                stack.push(ch);
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(ch==')' && stack.peek()=='('){
                    stack.pop();
                }
                else if(ch=='}' && stack.peek()=='{'){
                    stack.pop();
                }
                else if(ch == ']' && stack.peek() == ']'){
                    stack.pop();
                }
                else{
                    System.out.println(false);
                    return;
                }
            }

        }
        System.out.println(true);
    }
}
