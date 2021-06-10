//https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        int len = tokens.length;

        for(int i =0 ;i <len ; i++){
            if(!"+-*/".contains(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                int num2 = stack.pop();
                int num1 = stack.pop();

                String str = tokens[i];
                switch(str){
                    case "+" :
                         stack.push(num1 + num2);
                    break;
                    case "-":
                         stack.push(num1 - num2);
                    break;
                    case  "*":
                        stack.push(num1 * num2);
                    break;
                    case "/" :
                         stack.push(num1 / num2);
                    break;
                }
            }
        }

        return stack.pop();

    }
}