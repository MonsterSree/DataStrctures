import java.util.Stack;

class ValidateParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']' ){
                if(stack.isEmpty()){
                    return false;
                }
                Character previousChar=stack.pop();
                if(previousChar=='('){
                    if(s.charAt(i)!=')'){

                        return false;
                    }
                }
                else if(previousChar=='{'){
                    if(s.charAt(i)!='}'){
                        return false;
                    }
                }
                else{
                    if(s.charAt(i)!=']'){
                        return false;
                    }
                }
                
            }
            else{
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s="([{}])";
        System.out.println(isValid(s));
    }
}