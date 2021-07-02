package demo02Method;

import java.util.function.Supplier;

public class Demo01Method {
    public static void main(String[] args) {
        //1.构造方法引用
        Supplier<String> s1 = String :: new;
        Supplier<String> s2 = ()->new String();
        Supplier<String> s3 = new Supplier(){

            @Override
            public String get() {
                return null;
            }
        };


    }
}
