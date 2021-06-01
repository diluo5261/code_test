import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private String type;
    private double grade;


    public Student(String name, String type, double grade) {
        this.name = name;
        this.type = type;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                ", type='" + type + '\'' +
                ", grade=" + grade +
                '}';
    }
}

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三","二班",55));
        students.add(new Student("李四","四班",66));
        students.add(new Student("小明","八班",99));

        for (Student s: students ) {
            System.out.println(s);
        }



    }
}
