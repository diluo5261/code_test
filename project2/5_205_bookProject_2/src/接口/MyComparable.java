package 接口;

//<>表示对Person进行排序
//重写compareTO方法,选择排序依据
class Person implements Comparable <Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}

public class MyComparable {
    public static void main1(String[] args) {
        Person p1 = new Person("张三",45);
        Person p2 = new Person("李四",56);

        String str1 = "ABCD";
        String str2 = "abcd";
        int ret =  str1.compareTo(str2);
        System.out.println(ret);
//        p1.compareTo(p2)直接无法使用compareTo
        //自己定义的类型如果想要比较,一定要实现接口

        System.out.println(p1.compareTo(p2));
    }

}
