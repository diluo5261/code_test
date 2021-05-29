package 接口;

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class MyComparator {
    public static void main(String[] args) {
        Student s1 = new Student("tom",23);
        Student s2 = new Student("jerry",45);

        AgeComparator ageComparator = new AgeComparator();
        int ret = ageComparator.compare(s1,s2);
        System.out.println(ret);

        NameComparator nameComparator = new NameComparator();
        int ret2 = nameComparator.compare(s2,s1);
        System.out.println(ret2);


    }

}
