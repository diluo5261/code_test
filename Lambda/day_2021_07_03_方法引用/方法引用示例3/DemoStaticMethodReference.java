package java4;

public class DemoStaticMethodReference {
    public static void main(String[] args) {
        //调用method方法,计算绝对值

        /*int res = method(-10, new Calcable() {
            @Override
            public int calcAbs(int num) {
                return Math.abs(num);
            }
        });
        System.out.println(res);*/

       /* int res = method(-20,s -> Math.abs(s));
        System.out.println(res);*/

        int res = method(-30,Math ::abs);
    }

    public static int method(int number,Calcable c){
        return c.calcAbs(number);
    }
}
