package three_interface;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person[] p = new Person[3];
        p[0] = new Person("张三",10);
        p[1] = new Person("李四",30);
        p[2] = new Person("王五",20);

   /*     Arrays.sort(p);
        System.out.println(Arrays.toString(p));*/

        AgeComparator ageComparator = new AgeComparator();
        int ret = ageComparator.compare(p[0],p[1]);
        System.out.println(ret);
        Arrays.sort(p,ageComparator);
        System.out.println(Arrays.toString(p));

        NameComparator nameComparator = new NameComparator();
        System.out.println(nameComparator.compare(p[0], p[1]));
        Arrays.sort(p,nameComparator);
        System.out.println(Arrays.toString(p));

        //clone练习

        Person p1 = new Person("王浩",30);
        Person p2 = (Person)p1.clone();
        System.out.println(p2);

        //深拷贝

        System.out.println(p1.m.money);
        System.out.println(p2.m.money);
        System.out.println("****************");
        p2.m.money = 66;
        System.out.println(p1.m.money);
        System.out.println(p2.m.money);



    }
}

class Money implements Cloneable{
    double money = 9.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{//代表这个类是可以克隆的,2、重写方法，clone，就可以通过.来clone
    public String name;
    public int age;
    Money m = new Money();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        Person p = (Person) super.clone();
        p.m = (Money)this.m.clone();
        return p;
    }
}

