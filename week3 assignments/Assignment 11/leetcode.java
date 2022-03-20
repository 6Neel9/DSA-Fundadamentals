import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        int length = s.length();
        char[] s1 = s.toCharArray();
        if(length==0)
            return true;
        Stack<Character> stack = new Stack<>();
        
    for(int i=0;i<length;i++){
        if(s1[i]=='(' || s1[i]=='[' || s1[i]=='{'){
            stack.push(s1[i]);
        }
        else if(!stack.empty() && s1[i]==')' && stack.peek()=='('){
            stack.pop();
        }
        else if(!stack.empty() && s1[i]==']' && stack.peek()=='['){
            stack.pop();
        }
        else if(!stack.empty() && s1[i]=='}' && stack.peek()=='{'){
            stack.pop();
        }
        else {
            return false;
        }
    }
        
        return stack.empty();
   }
   public static void main(String args[]){
       String s = "(]";
       boolean l1 = isValid(s);
       System.out.println(l1);
   }
}