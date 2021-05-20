package day15.exer1;
/*
定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各
类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
型,name,number,birthday,以及该对象生日。当键盘输入本月月份值时，如果本
月是某个Employee对象的生日，还要输出增加工资信息。
 */

import java.util.Scanner;

public class PayrollSystem{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入当前月份:");
        int month = scan.nextInt();

        Employee [] employees = new Employee[2];

        employees[0] = new SalariedEmployee("张三",1002,new MyData(1995,2,28),10000);
        employees[1] = new HourEmployee("李四",2002,new MyData(1998,1,8),60,240);

        for (int i = 0; i <employees.length ; i++) {
            System.out.println(employees[i]);
            double salary = employees[i].earnings();
            System.out.println("月工资为: "+ salary);

            if (month == employees[i].getBirthday().getMonth()) {
                System.out.println("生日快乐!,奖励100元");
            }

        }
    }


}
