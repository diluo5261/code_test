package day15.exer2;

import java.util.Scanner;

public class ParyrollSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入月份:");
        int month = scan.nextInt();

        Employee[] emp = new Employee[2];

        emp[0] = new SalariedEmployee("张三",1002,new MyDate(1995,3,22),10000);
        emp[1] = new HourlyEmployee("李四",5005,new MyDate(1998,1,5),100,250);

        for (int i = 0; i <emp.length ; i++) {
            System.out.println(emp[i]);

            if (month == emp[i].getBirthday().getMonth()){
                System.out.println("happy birthday!add 100$");
                System.out.println("月工资为:" + (emp[i].earnings()+100));
            }else{
                System.out.println("月工资为:" + emp[i].earnings());
            }


        }
    }
}
