import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection <Integer> coll = new ArrayList<>();

        coll.add(12);
        coll.add(23);
        coll.add(34);
        coll.add(45);
        coll.add(56);

        //获取集合中元素的个数size()
        System.out.println(coll.size());
        System.out.println(coll);

        Collection<Integer> coll2 = new ArrayList<>();
        coll2.add(012);
        coll2.add(023);
        coll2.add(034);
        coll2.add(045);

        coll.addAll(coll2);

        System.out.println(coll.size());
        System.out.println(coll);

        //isEmpty()判断当前集合是否为空
        System.out.println(coll.isEmpty());

        //clear清空集合元素
        coll.clear();
        System.out.println(coll);

        System.out.println(coll.isEmpty());



    }
}