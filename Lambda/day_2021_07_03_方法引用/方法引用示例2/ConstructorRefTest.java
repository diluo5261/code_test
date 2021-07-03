package java3;

import java2.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRefTest {
    @Test
    public void test(){
        Supplier<Employee> sup = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };

        System.out.println(sup);

        Supplier<Employee> sup2 = () -> new Employee();
        System.out.println(sup2.get());

        Supplier<Employee> sup3 = Employee :: new;
        System.out.println(sup3.get());
    }

    @Test
    public void test1(){
        Function<Integer,Employee> fun1 = new Function<Integer, Employee>() {
            @Override
            public Employee apply(Integer integer) {
                return new Employee(integer);
            }
        };

        Function<Integer,Employee> fun2 = i -> new Employee(i);

        Function<Integer,Employee> fun3 = Employee :: new;
    }

    //数组引用
    @Test
    public void test2(){
        Function<Integer,String[]> fun1 = new Function<Integer, String[]>() {
            @Override
            public String[] apply(Integer integer) {
                return new String[integer];
            }
        };

        Function<Integer,String[]> fun2 = i -> new String[i];

        System.out.println(fun2.apply(10));

        Function<Integer,String[]> fun3 = String[] :: new ;
        System.out.println(Arrays.toString(fun3.apply(10)));

    }
}
