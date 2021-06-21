import java.util.Iterator;
import java.util.TreeSet;

/**
 * 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章：
 * TreeSet 需使用泛型来定义）
 * 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 * 1). 使 Employee 实现 Comparable 接口，并按 name 排序
 * 2). 创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序
 */
public class EmployeeTest {
    public static void main(String[] args) {
        CompareByBirthday com = new CompareByBirthday();
        TreeSet<Employee> set = new TreeSet<>(com);
        set.add(new Employee ("tom",43,new MyDate(1987,5,4)));
        set.add(new Employee ("bob",85,new MyDate(1992,8,6)));
        set.add(new Employee ("lisa",29,new MyDate(1952,5,9)));
        set.add(new Employee ("jone",15,new MyDate(1997,6,4)));
        set.add(new Employee ("pink",30,new MyDate(1988,8,8)));

        Iterator<Employee> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }



    //使用自然排序
    /*public static void main1(String[] args) {
        TreeSet<Employee> set = new TreeSet<>();

        set.add(new Employee ("tom",43,new MyDate(1987,5,4)));
        set.add(new Employee ("bob",85,new MyDate(1992,8,6)));
        set.add(new Employee ("lisa",29,new MyDate(1952,5,9)));
        set.add(new Employee ("jone",15,new MyDate(1997,6,4)));
        set.add(new Employee ("pink",30,new MyDate(1988,8,8)));

//        System.out.println(set);
        Iterator<Employee> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }*/
}
