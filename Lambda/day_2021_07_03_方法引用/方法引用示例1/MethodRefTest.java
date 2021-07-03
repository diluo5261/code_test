package java2;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/*
    情况一:    对象 :: 实例方法
    情况二:    类 :: 静态方法
    情况三:    类 :: 非静态方法
 */
public class MethodRefTest {
   //情况一: 对象 :: 非静态方法
    @Test
    public void test(){
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> con2 = s -> System.out.println(s);

        Consumer<String> con3 = System.out :: println;

        con1.accept("hello");
        con2.accept("nihao");
    }

    @Test
    public void test1(){
        Employee e1 = new Employee(1001,"李四",45,5823);
        Supplier<String> sup = ()-> e1.getName();
        System.out.println(sup.get());

        System.out.println("***********************************************");

        Supplier<String> sup2 = e1 :: getName;
        System.out.println(sup.get());
    }

    //情况二: 类  ::静态方法
    @Test
    public void test2(){
        Comparator<Integer> com = (o1,o2) -> Integer.compare(o1,o2);
        System.out.println(com.compare(52,26));

        Comparator<Integer> com1 = Integer :: compare;
        System.out.println(com1.compare(23, 54));

    }

    @Test
    public void test3(){
        Function<Double,Long> fun = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        Function<Double,Long> fun2 = d -> Math.round(d);
        System.out.println(fun2.apply(55.3));

        Function<Double,Long> fun3 = Math :: round;
        System.out.println(fun3.apply(96.23));
    }

    @Test
    public void test4(){
        Employee e1 = new Employee(1001,"tom",23,6230);

        Function<Employee,String> fun1 = e -> e.getName();
        System.out.println(fun1.apply(e1));

        System.out.println("********************");
        Function<Employee,String> fun2 = Employee::getName;
        System.out.println(fun2.apply(e1));
    }
}
