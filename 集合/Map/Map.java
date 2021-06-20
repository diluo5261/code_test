package Collection;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>();
        //put()将指定元素添加到map对象中
        map.put("A",1);
        map.put("Z",9);
        map.put("D",5);
        map.put("F",10);

        System.out.println(map);

        Map<String ,Integer> map2 = new HashMap<>();
        map2.put("AA",99);
        map2.put("ZZ",55);
        map2.put("FF",33);
        //将map2中的所有元素放入到
        map.putAll(map2);
        System.out.println(map);

        System.out.println(map.remove("ZZ"));
        System.out.println(map.remove("D", 5));

//        map.clear();
        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.get("AA"));

        System.out.println(map.containsKey("AA1"));
        System.out.println(map.containsValue(99));

        System.out.println(map.isEmpty());
        Map<String , Integer> map3 = new HashMap<>();
        map3.put("AA",99);
        map3.put("FF",33);
        map3.put("A",1);
        map3.put("Z",9);
        map3.put("F",10);

        System.out.println(map);
        System.out.println(map3);
        System.out.println(map.equals(map3));

        //元视图操作方法

        Set<String> set1 = map.keySet();

        Iterator<String> iterator1 = set1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        Collection<Integer> coll1 = map.values();
        Iterator<Integer> iterator2 = coll1.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        //遍历所有的集合
        //方式一
        Set set2 = map.keySet();
        Iterator iterator3 = set2.iterator();
//        while(iterator3.hasNext()){
//            System.out.println(iterator3.next());
//        }

        //方式二:
        while(iterator3.hasNext()){
            Object key = iterator3.next();
            Object values = map.get(key);
            System.out.println(key + "=="+ values );
        }


    }
}
