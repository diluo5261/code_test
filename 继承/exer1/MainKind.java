package day12.exer1;

public class MainKind {
    private int sex;
    private int salary;



    public void manOrWoman(){
        if (1== this.sex){
            System.out.println("man");
        }else if (0 == this.sex){
            System.out.println("woman");
        }
    }

    public void employeed(){
        if(0 == salary){
            System.out.println("no job");
        }else{
            System.out.println("job");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
