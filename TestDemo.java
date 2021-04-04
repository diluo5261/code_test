/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-04-02
 * Time: 18:36
 */
public class TestDemo {


    //运算符的优先级是和C语言是一样的，但是不要记
    public static void main(String[] args) {
        int year = 2020;
        if((year%4==0 && year%100!=0) || (year%400==0)) {
            System.out.println(year +" is leapYear!");
        }
    }
    public static void main18(String[] args) {
        int a = 10;
        if(a == 10)
            System.out.println("a == 10");
        //System.out.println("hello");  如果你没有加括号，那么默认只包含一行
        else
        System.out.println("else");
    }

    public static void main17(String[] args) {
        int x = 20;
        int y = 10;
        if (x == 10) {
            if (y == 10) {
                System.out.println("aaa");
            }else {
                System.out.println("bbb");
            }
        }
        //以后写代码  只要有花括号 就一定要写
    }

    public static void main16(String[] args) {
        int x = 20;
        int y = 10;
        if (x == 10)
            if (y == 10)
                System.out.println("aaa");
            else
                System.out.println("bbb");
    }

    public static void main15(String[] args) {
        int a = 10;
        if(a > 10);//分号代表语句的结束
        //以下代码的执行 不需要任何的条件
        {
            System.out.println("a  > 10");
        }
    }


    public static void main14(String[] args) {
        int a = 10;
        if(a > 10) {
            System.out.println("a>10");
        } else if(a == 10) {
            System.out.println("a == 10");
        }else {
            System.out.println("a < 10");
        }
    }


    /**
     * 文档注释:一般用在方法和类的前别
     * @param args
     */
    public static void main13(String[] args) {
        //System.out.println(false==false?(true==true?false:true):true);
        //System.out.println((1 + 2) * 3);//9
        System.out.println("aaa");
        System.out.println("ccc");
        System.out.println("bbb");
    }


    /*
     块注释fs
     fsafsda
     法大大
     dfasfa
     */
    public static void main12(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;
        int max = c > (a > b ? a : b) ? c : (a > b ? a : b);
        System.out.println(max);
    }


    public static void main11(String[] args) {
        //System.out.println(-1>>>1);
        int a = 10;
        int b = 30;
        int c = 20;
        int max2 = a > b ? a : b;
        int max3 = c > max2 ? c : max2;
        System.out.println(max3);
    }

    public static void main10(String[] args) {
        int a = 0xf;
        System.out.printf("%x\n", ~a);
        System.out.print("输出且不换行");
        System.out.println("输出换行");
    }

    public static void main9(String[] args) {
        //System.out.println(10 > 20 && 10/0==0);
        //System.out.println(10 < 20 && 10/0==0);
        //System.out.println(10 > 20 || 10/0==0);
        //System.out.println(10 < 20 || 10/0==0);
        //int a = 10;
        //System.out.println(!a);//!布尔表达式
        /*System.out.println(!true);
        System.out.println(!false);*/
        //System.out.println(10 > 20 & 10 / 0 == 0); // 程序抛出异常
        System.out.println(10 < 20 | 10 / 0 == 0); // 程序抛出异常
    }
    public static void main8(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == b);//false
        System.out.println(a < b);//true
        System.out.println(a > b);//false
        System.out.println(a != b);//true
        System.out.println(a >= b);//false  a>b或者a == b
        System.out.println(a <= b);//true
    }


    public static void main7(String[] args) {
        int a = 10;
        //a++; 这个时候没有任何的区别
        //int b = a++;//b = a; a=a+1
        int b = ++a;//a = a+1  b = a;
        System.out.println(a);//11
        System.out.println(b);//11
    }
    /**
     * 复合运算符：+= -= *= /=  都会帮把我们进行一次强制类型转换
     * @param args
     */
    public static void main6(String[] args) {
        int a = 10;
        a += 2;//a = a+2
        System.out.println(a);
        short b = 6;
        b += 2;//b = (short)(b+2);
        System.out.println(b);
    }

    public static void main5(String[] args) {
        //System.out.println(11.5 % 2.0);
        System.out.println(10/0);
    }
    public static void main4(String[] args) {
        //%   求余数   求模
        System.out.println(10%3);//1
        System.out.println(10%-3);//1
        System.out.println(-10%3);//-1
        System.out.println(-10%-3);//-1
    }

    public static void main3(String[] args) {
        System.out.println(5/2);//2
        System.out.println((float)5/2);//2.5
        System.out.println(5/(float)2);//2.5
        System.out.println((float)(5/2));//2.0
    }

    public static void main2(String[] args) {

        System.out.println(5+2);
        System.out.println(5-2);
        System.out.println(5*2);
    }
    public static void main1(String[] args) {
        short a = 128;
        byte b = (byte)a;//-128 - 127
        System.out.println(b);

        System.out.println("\\\"hello\\\"");
    }
}
