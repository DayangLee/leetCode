import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == '{' || curr == '(' || curr == '['){
                stack.push(curr);
            } else if(curr == '}' && !stack.empty() && stack.peek() == '{'){
                stack.pop();
            } else if(curr == ')' && !stack.empty() && stack.peek() == '('){
                stack.pop();
            } else if(curr == ']' && !stack.empty() && stack.peek() == '['){
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();

    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("(])"));
    }
}
