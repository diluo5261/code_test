package day15.exer;

public class EmployTest {
    public static void main(String[] args) {
        Employee manager = new Manager("张三",1002,5200.0,96223.2);
        manager.work();

        Employee com = new CommonEmployment();
        com.work();
    }
}
