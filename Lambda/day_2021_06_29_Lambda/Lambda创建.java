Lambda表达式的本质：作为函数式接口的实例;

从匿名类到Lambda表达式的转换举例1:
//匿名内部类
Runnable r1 = new Runable(){
    @Override
    public void run(){
        System.out.println("Hello");
    }
};

//Lambda 表达式

Runnable r1 = () -> System.out.println("Hello");



从匿名类到Lambda表达式的转换举例1:
//原来使用匿名内部类作为参数传递
TreeSet<String> ts = new TreeSet<>(new Comparator<String>(){
    @Override
    public int compare(String o1, String o2){
        return Integer.compare(o1.length(),o2.length());
    }
});

//Lambda 表达式作为参数传递
TreeSet<String> ts = new TreeSet<>(
    (o1,o2) -> Integer.compare(o1.length(),o2.length());
);



Lambda表达式:语法
->: Lambda操作符或者箭头操作符

左侧:指定了Lambda表达式需要的参数列表
右侧:指定类Lambda体,是抽象方法的实现逻辑,也即Lambda表达式要执行的功能.

语法格式一:无参,无返回值
public class LambdaTest(){
    Runnable r1 = new Runnable(){
        @override
        public void run(){
             System.out.println("Hello");
        }
    };
    r1.run();
    
//**************************
    Runnable r2 = () ->{
         System.out.println("Hello");
    };
}


语法格式二：Lambda 需要一个参数，但是没有返回值。
public void test(){
    Consumer<String> con = new Consumer<String>(){
      @Override
      public void accept(String s){
          System.out.println(s);
      }  
    };
    
    con.accept("hello);
    
//****************************
    Consumer <String> con1 = (String s) ->{System.out.println(s);};
    con1.accept("hello");
}


语法格式三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
public void Test(){
    Consumer <Stirng> con = (String s) ->{
        System.out.println(s);
    };
    con.accept("hello);
    
//****************************************

    Consumer <String> con = (s) -> {
        System.out.println(s);
    };
    con.accept("hello");
}


语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
public void test(){
    Consumer <String> con = (s) ->{
        System.out.println(s);
    };
    con.accept("hello");
    
//********************************
    Consumer<String> con = s -> {
        System.out.println(s);
    };
}

语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
public void test(){
    Comparetor <Integer> com = new Compartor<Integer> (){
        @Override
        public int compare(Integer o1 , Integer o2){
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
    System.out.println(com.compare(12,21));
    }
    
//**********************************************
    Comparator<Integer> com = (o1,o2) ->{
      System.out.println(o1);
      System.out.println(o2); 
      return o1.compareTo(o2); 
    };
    System.out.println(com.compare(12,21));
}

语法格式六：当 Lambda 体只有一条语句时，return 与大括号若有，都可以省略
public void test(){
    Comparato<Integer> com = (o1 , o2) -> {
        return o1.compareTo(o2);
    };
    
    System.out.println(com.compare(12,21));
    
//************************************************
    Comprator<Integer> com = (o1,o2) -> o1.CompareTo(o2);
    System.out.println(com.compare(12,4));
  
}


public void test(){
    Consumer <String> con = s->{
        System.out.println(s);
    };
    con.accept("hello");
//************************************
    Consumer<String> con = s-> System.out.println(s);
    con.accept("hello");
}

