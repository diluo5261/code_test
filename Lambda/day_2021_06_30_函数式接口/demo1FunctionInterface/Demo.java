package demo1.FunctionInterface;

public class Demo {
    public static void show(MyFunctionInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        //调用show方法,show方法的参数是一个接口,所以可以传入接口的实现类
        MyFunctionImplements myFunctionImplements = new MyFunctionImplements();
        show(myFunctionImplements);

        //show方法的参数是一个接口,可以传入接口的匿名内部类

        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类的方法");
            }
        });

        //show方法的参数是一个函数式接口,所以可以使用Lambda表示式
        show(()-> System.out.println("Lambda表达式实现"));
    }
}
