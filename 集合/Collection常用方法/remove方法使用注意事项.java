package day05;

import java.util.ArrayList;
import java.util.List;

public class RemoveTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(4);

        list.remove(2);//此时删除的是下标为2的值
        System.out.println(list);
        //如果向删除2元素
        //方法一:
//        list.remove(new Integer(2));
//        System.out.println(list);

        //方法二
        list.remove(list.get(1));
        System.out.println(list);

    }
}