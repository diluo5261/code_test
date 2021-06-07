
//方法1
class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() == 0){
            return true;
        }

        //定义一个栈来存储左括号
        Stack<Character> stack = new Stack<>();
        //开始遍历当前的字符串

        for(int i = 0;i < s.length();i++){
            //获取当前i下标的字符

            char ch = s.charAt(i);
            //判断当前字符是哪个左括号
            if(ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            }else{
                //进入else说明当前括号为右括号
                //判断栈空不空
                if(stack.empty()){
                    System.out.println("右括号多");
                    return false;
                }

                //获取栈顶元素的括号,但是先别出栈
                char top = stack.peek();
                if(top == '(' && ch == ')'  || top == '{' && ch == '}'  || top == '[' && ch == ']'){
                    stack.pop();
                }else{
                      System.out.println("左右括号不匹配");
                     return false;
                }
            }
        }

        if(!stack.empty()){
            System.out.println("左括号多");
            return false;
        }

        return true;

    }
}

//方法2
class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() == 0){
            return false;
        }

        if(s.length() % 2 != 0 ){
            return false;
        }
        
        int a = s.length() / 2;
        for(int i =0; i< a ;i++){
            s = s.replace("()","").replace("[]","").replace("{}","");
        }

        

        return s.length() == 0;

    }
}