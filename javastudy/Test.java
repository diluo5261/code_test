
class Person {
    //
    /**
     *
     * 定义再方法的外部  类的内部
     *
     *                      1、普通成员变量  实例成员变量
     * 字段/属性/成员变量
     *                      2、静态成员变量(类变量)    public static int count = 0;
     *
     * 如果没有初始化  默认值 是对应的o值。
     *
     */

    private String name;
    private String sex;
    public int age;
    public static int count=100;
    public  final  int SIZE =10;
    public static final int cou = 90;

    static {
        //this.name = "wusong";
        count = 99999;
        System.out.println("静态代码块！！！");
    }

    {
        this.name = "wusong";
        System.out.println("实例代码块或者叫做构造代码块！");
    }
    //构造方法
    public Person() {
        //this("renzhen");
        System.out.println("不带有参数的构造方法！！");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("调用带有1个参数的构造方法！！ Person(String )");
    }

    public Person(String name,String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println("调用带有2个参数的构造方法！！ Person(String,String)");
    }

    //提供公有的get  and  set 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //

    /**
     *               1、普通的成员方法     实例成员方法
     * 成员方法/行为
     *               2、静态的成员方法(类方法)
     *
     *
     */

    public void eat() {
        this.getSex();
        /*System.out.println(age);
        System.out.println(name);
        System.out.println(count);
        staticFunc();*/
        System.out.println(this.age);
        System.out.println("eat()!!!!");
    }


   
    public static void staticFunc() {
        //System.out.println(this.age);
        //System.out.println(name);
        System.out.println(count);
        //eat();
        System.out.println(" staticFunc()!!!!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

}

public class TestDemo {


    public static void main(String[] args) {
        System.out.println(Person.count);
    }

    public static void main12(String[] args) {
        Person person1 = new Person();
        System.out.println("==============");
        Person person2 = new Person();
    }


    public static void main11(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);
    }

    public static void main10(String[] args) {
        Person person1 = new Person();

        Person person2 = new Person("caocao");
        System.out.println(person2);
        Person person3 = new Person("zhangfei","男");
        System.out.println(person3);

    }

    //类的调用者
    public static void main9(String[] args) {
        Person person = new Person();
        //person.name = "gaobo";
        person.setName("gaobo");
        //System.out.println(person.name);
        System.out.println(person.getName());
    }




    public static void main8(String[] args) {
        Person person = new Person();
        System.out.println(person.SIZE);

        System.out.println(Person.cou);
    }

    public  void func() {

    }
    //为什么main函数  他是静态的。  JVM里面会自动调用这个静态函数的。

    public static void main67(String[] args) {
        TestDemo testDemo = new TestDemo();
        testDemo.func();
    }


    public static void main6(String[] args) {
        Person.staticFunc();
    }

    public static void main5(String[] args) {
        Person person = new Person();
        person.eat();
        //person.staticFunc();
        Person.staticFunc();
    }


    /**
     * 静态的成员变量 是不依赖于 对象的
     *
     * @param args
     */
    public static void main4(String[] args) {

        Person per = null;//per不指向任何对象
        //System.out.println(per.count);
        //System.out.println(per.name);

        /*Person.count++;
        System.out.println(Person.count);//1

        Person.count++;
        System.out.println(Person.count);//2*/

    }
    public static void main3(String[] args) {
        Person person = new Person();
        person.age++;
        System.out.println(person.age);//1

        Person.count++;
        System.out.println(Person.count);//1

        Person person2 = new Person();
        person2.age++;

        Person.count++;
        System.out.println(Person.count);//2

        System.out.println(person2.age);//1


    }

    public static void main2(String[] args) {
        Person person = new Person();
        //System.out.println(person.name);
        //System.out.println(Person.name);
        System.out.println("===============");
        //System.out.println(person.count);//静态的成员变量，访问的方式是：类名.静态成员变量
        System.out.println(Person.count);
    }


    public static void main1(String[] args) {
        //实例化一个对象  new
        Person person = new Person();
        System.out.println(person);
        //person.name = "gaobo";
        person.age = 10;
        person.eat();
        System.out.println(person);


    }
}
