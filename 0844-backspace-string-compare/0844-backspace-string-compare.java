class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch =='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
               } else{
                    stack.push(ch);
                }
        }
     for(char ch : t.toCharArray()){
        if(ch == '#'){
        if(!stack1.isEmpty()){
         stack1.pop();
        }
       } else{
            stack1.push(ch);
        }
     }
     return stack.equals(stack1);
    }
}