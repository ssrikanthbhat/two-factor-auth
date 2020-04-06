import java.util.Stack;

public class BalanceParenthesis {

    /***
     *
     *
     *
     * # Given a string containing just the characters
     * # '(', ')',
     * # '{', '}',
     * # '[' and ']',
     * # determine if the input string is valid
     *
     * # Example 1:
     * # Input: "()"
     * # Output: true
     *
     * # Example 2:
     * # Input: "()[]{}"
     * # Output: true
     *
     * # Example 3:
     * # Input: "(]"
     * # Output: false
     *
     * # Example 4:
     * # Input: "([)]"
     * # Output: false
     *
     * # Example 5:
     * # Input: "{[]}"
     * # Output: true
     */


    public boolean balanceParenthesis(String text) {
        final Stack stack = new Stack<String>();
        for (int i=0; i< text.length(); i++) {

            if(text.charAt(i) == '[' || text.charAt(i) == '{' || text.charAt(i) == '(') {
                stack.add(text.charAt(i));
            } else if(text.charAt(i) == ']' && (stack.empty() || !(stack.pop().toString().equals("["))))  {
                return false;
            } else if(text.charAt(i) == '}' && (stack.empty() || !(stack.pop().toString().equals("}"))))  {
                return false;
            } else if(text.charAt(i) == '(' && (stack.empty() || !(stack.pop().toString().equals(")"))))  {
                return false;
            }
        }


        return stack.empty();
    }
    public  static void main(String[] args) {
        BalanceParenthesis bal = new BalanceParenthesis();
        //       System.out.println(bal.balanceParenthesis("()"));
        //       System.out.println(bal.balanceParenthesis("()[]{}"));
        //       System.out.println(bal.balanceParenthesis("(]"));
        //       System.out.println(bal.balanceParenthesis("([)]"));
        System.out.println(bal.balanceParenthesis("{[]}"));
    }
}
