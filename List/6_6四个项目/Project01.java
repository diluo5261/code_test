package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student implements Comparable <Student>{
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}

public class Project01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三",25,66.3));
        students.add(new Student("李四",56,55.5));
        students.add(new Student("王五",22,22.3));

        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);

    }
}
