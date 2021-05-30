import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class WrapperTest {
    public static void main(String[] args) {
//        Integer in1= new Integer(12);
//        Integer in2 = new Integer(12);
//
//        System.out.println(in1 == in2);
//
//        Integer in10 = 55;
//        Integer in20 = 55;
//        System.out.println(in10 == in20);
//
//        Integer in30 = 128;
//        Integer in40 = 128;
//        System.out.println(in30 == in40);
//
//        //基本数据类型-->包装类
//        int num1 = 10;
//        Integer num2 = new Integer(num1);
//        System.out.println(num2.toString());
//
//        Boolean b1 = new Boolean("true");
//        Boolean b2 = new Boolean("truea");
//        System.out.println(b1);
//        System.out.println(b2);
//
//        //包装类-->基本数据类型
//
//        Integer num10 = new Integer(12);
//        int i1 = num10.intValue();
//        System.out.println(num10 +1);
//        System.out.println(i1+1);


        //基本数据类型、包装类-->String类型：调用String重载的valueOf(Xxx xxx)
        int num1= 10;
        Integer iNum1= new Integer(10);

        int num2 = iNum1.intValue();
        System.out.println(num2);

        String str1 = num1 +"";
        //方法一：
        System.out.println(str1);
        //方法二：调用String的ValueOf()

        String str2 = String.valueOf(num1);

        Double d1 = new Double(99.999);
        double num10 = d1.doubleValue();

        String str3 = String.valueOf(d1);
        String str4 = String.valueOf(num10);

        //String类型 --> 基本数据类型、包装类的parseXxx（String s）
        String str5 = "888";
        int num20 = Integer.parseInt(str5);
        Integer num21 = Integer.parseInt(str5);



        System.out.println(num20);
        System.out.println(num21);



    }


}
