package day15.exer;
/*
对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
请使用继承的思想，设计CommonEmployee类和Manager类，要求类
中提供必要的方法进行属性访问。
*/

public class CommonEmployment extends Employee{

    @Override
    public void work() {
        System.out.println("生产产品!");

    }
}
