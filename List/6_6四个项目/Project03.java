package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//有一个List当中存放的整形的数据,要求使用Collections.sort对List进行排序
public class Project03 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(3);
        list.add(0);

        Collections.sort(list);
        System.out.println(list);
    }
}
