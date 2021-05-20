package day15.exer1;

abstract  public class Employee {
    private String name;
    private int number;
    private MyData birthday;

    //构造器
    public Employee(String name, int number, MyData birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    //get  set  方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyData getBirthday() {
        return birthday;
    }

    public void setBirthday(MyData birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDataString() +
                '}';
    }
}
