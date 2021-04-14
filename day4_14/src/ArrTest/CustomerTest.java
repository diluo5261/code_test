package ArrTest;
/*
* 类中方法的声明和使用
* 方法：描述类应具有的功能
* 比如：Math类：sqrt()\random()....
*      Scanner类：nextXxx()...
*      Arrays类：sort()\binarySearch()\toString(()\equals()\...
*
* 1、举例：
*
* 2、方法的声明：权限修饰符 返回值类型 方法名（形参列表）{
*                   方法体
*               }
*
* 3、说明
*       >关于权限修饰符：java规定的权限修饰符：private \ public \ 缺省 \ protected
*       >返回值类型：有返回值  VS  没有返回值
*               如果方法有返回值，则必须在方法声明时，指定返回值的类型，同时，方法中需要使用return 福安剪子返回指定返回值的类型
*               如果方法没有返回值，则方法声明时，使用void来表示。（只能使用return表示结束此方法的意思）
*       >方法名：属于标识符，遵循标识符的规则和规范，“见名知意”
*       >形参列表：数据类型1 形参1，数据类型2 形参2，.....
*
* 4、return 关键字的作用：
*       1、使用范围：使用在方法体中
*       2、作用：结束方法，针对有返回值类型的方法，使用return数据返回所需要的数据。
 *
 *5、方法的使用中可以调用当前类的属性或方法，方法中不能定义方法
 *       特殊的：方法中又调用了方法（递归）
* */


public class CustomerTest {
    public static void main(String[] args) {
        PersonInfo p100 = new PersonInfo();
        p100.name = "Tom";
        p100.age =18;
        p100.sex = 1;
        p100.study();
        p100.showAge();
        p100.addAge(2);
        p100.showAge();
    }

}

