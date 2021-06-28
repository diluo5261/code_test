 public void test() throws Exception {
        //方法一:调用运行时类的属性
        Class clazz1 = Person.class;
        
        //方法二:调用运行时类的对象的getClass()方法
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        
        //方法三:调用Class的静态方法,forName(String pathPath)
        Class clazz3 = Class.forName("ReflectTest.java1.Person");
        
        //方法四:使用类的加载器
        ClassLoader loader = ReflectTest.class.getClassLoader();
        Class clazz4 = loader.loadClass("ReflectTest.java1.Person");
}