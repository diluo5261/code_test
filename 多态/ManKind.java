package day12.exer;

/*
定义一个MainKind类,包括:
成员变量int sex 和 int salary:
方法void manOrWomen(),根据sex的值显式"man" sex == 1 或"woman"(sex == 2)
方法void employeed():根据salary的值侠士no job(salary == 0) 或者"job"(salary !=0)



 */

public class ManKind {
    private int sex;
    private int salary;

    public void manOrWomen(){
        if(sex == 1){
            System.out.println("man");
        }else if (sex == 2){
            System.out.println("woman");
        }
    }

    public void employeed(){
        //方法1:
        if (salary == 0){
            System.out.println("no job");
        }else if (salary == 1){
            System.out.println("job");
        }

    }

}
