package java3;
/*
1.泛型在继承方面的体现
虽然A类是B类的父亲,但是G<A> 和G<B> 二者不具备子父类关系,二者是并列关系
补充:类A是类B的父类,A<G> 是 B<G> 的父类

 */

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
//        Object obj = null;
//        String str = null;
//        obj = str;
//
//        Object [] arr1 = null;
//        String [] arr2 = null;
//        arr1 = arr2;

//        Integer [] arr3 = null;
//        Double [] arr4 = null;
//        arr4 = (Double)arr3;

//        List<Object> list1= null;
//        List<Integer> list2 = null;
        //此时的list1和list2的类型不具有子父类关系
//        list1 = list2;//编译不通过


        /**************通配符*************/

        //类A是类B的父类,G<A> 和 G<B> 是没有关系的,二者共同的父类是:G<?>

        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list3 = null;
        list3 = list1;
        list3 = list2;
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(15);
        list4.add(16);
        list4.add(8);

        list3 = list4;
        System.out.println(list4);
        //添加(写入):对于List<?>就不能向其内部添加数据,null除外
//        list3.add(5);
        list3.add(null);
        System.out.println(list4);

        //有条件的通配符使用

        List<Person> l1 = new ArrayList<>();
        List<Employee> l2 = new ArrayList<>();
        List<Object> l3 = new ArrayList<>();

        List<? extends Person> l10 = new ArrayList<>();
        List<? super Person> l20 = new ArrayList<>();

        l10 = l1;
        l10 = l2;
//        l10 = l3;

        l20 =  l3;
        l20 = l1;
//        l20 = l2;

        //读取数据
        l10 = l2;
//        Employee e = l10.get(0);

        Person p1 = l10.get(0);

        //编译通过
//        l10.add(new Employee());
//        l10.add(new Person());

        l20.add(new Person());
        l20.add(new Employee());



    }
}
