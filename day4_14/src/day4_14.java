/*
* 一、java面向对象的三条学习主线：（第4-6章）
* 1、Java类及类的成员：属性、方法、构造器；代码块、内部类
* 2、面向对象的三大特征：封装性、继承性、多态性、（抽象性）
* 3、其他关键字：this\super static final abstract interface package import
* “大处着眼，消除着手”
*
*  二、人把大象装冰箱
* 1、面向过程:强调的功能行为,以函数为最小单位,考虑怎么去做.
* >把冰箱门打开
* >抬起大象,塞进冰箱
* >把冰箱门关闭
*
* 2、面向对象：强调具备了功能的对象，以类、对象为最小的单位，考虑谁来做
*   人{
*          打开（冰箱）{
*           冰箱.开开()；
*          }
*
*          抬起(大象){
*               大象.进入(冰箱);
*          }
*
*          关闭(冰箱){
*               冰箱.闭合();
*          }
*   }
*
*  冰箱{
*       开开(){};
*       闭合(){};
*  }
*
*   大象{
*        进入.冰箱(){};
*   }
*
* 三、面向对象的两个要素
* 共性和个性
*
* 类：对一类事物的描述，是抽象的、概念上的定义
* 对象：是实际存在的该事物的每个个体（实实在在的某个人），因而也称为实例（instance）
*
* >面向对象长须设计的重点是类的设计
* >设计类,就是设计类的成员
*
* */


/*
*属性 = 成员变量 = field = 域、字段
*方法 = 成员方法 = 函数 = method
*
*创建类的对象 = 类的实例化  = 实例化类
*
* 二、类和对象的使用（面向对象思想落地的实现）
* 1、创建类、设计类的成员
* 2、创建类的对象
* 3、通过“对象。属性” 或“对象。方法”调用对象结构
*
* 三、如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性。（非static）
*   意味着：如果我们修改一个对象的属性a，则不影响另一个对象属性a的值。
*
* 四、对象内存的解析
*
* 类中属性的应用
* 属性（成员变量）   VS 局部变量
* 1、相同点
*   >定义变量的格式：数据类型 变量名 = 变量值
*   >先声明，后使用
*   >变量都有其对应的作用域
*
* 2、不同点：
*   >在类中声明的位置不同
*       属性：定义在类的一对{}内
*       局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
*   >关于权限修饰符的不同
*       属性：可以在声明属性时，指明其权限，使用权限修饰符
*           常用的权限修饰符：private、public 、缺省、protected  --> 封装性
*           目前大家声明属性时，都使用缺省
*       局部变量：不可以使用权限修饰符
*
*   >默认初始化值情况
*       属性：类的属性，根据其类型，都有默认初始化值
*           整型：0  浮点型 0.0  布尔型 false  引用数据类型（类、数组、接口） null
*       局部变量：没有默认初始化值，在调用局部变量之前一定要先赋值
*   >在内存中加载的位置：
*       属性：加载到堆空间中 （非static）
*       局部变量：
*
* */

import ArrTest.PersonInfo;

public class day4_14 {
    public static void main(String[] args) {
        //创建Person类对象
        PersonInfo p1 = new PersonInfo();

        //调用对象的结构:属性~方法
        //调用属性:对象.属性
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        //调用方法对象
        p1.eat();

        //******************************
        PersonInfo p2 = new PersonInfo();
        System.out.println(p2.name); //null
        System.out.println(p2.isMale);//false

        //**********************************
        PersonInfo p3 =p1;//将p1变量保存的地址值赋给p3，导致p1和p3指向了堆空间的同一个对象实体
        System.out.println(p3.name);//Tom

        p3.age = 10;
        System.out.println(p1.age); // 10


    }
}

    class Person{
        //属性
        String name;
        int age;
        boolean isMale;

        //方法
        public  void eat(){
            System.out.println("可以吃饭");
        }
    }




