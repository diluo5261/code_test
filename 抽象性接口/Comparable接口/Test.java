/*
package three_interface;

import java.util.Arrays;

class Person implements Comparable <Person>{//<>表示Person这个类是可比较的
    public String name;
    public int age;

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


    //比较规则
    @Override
    public int compareTo(Person o) {
        return this.age - o.age;

    }
}

public class Test {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Person("张三",10);
        p[1] = new Person("李四",30);
        p[2] = new Person("王五",20);
//        System.out.println(p[0].compareTo(p[1]));

        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
        Comparable p1 = new Person("jone",55);

    }
}
*/
