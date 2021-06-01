package exer;

public class ATest {
    public static void main(String[] args) {

        A <Integer> integerA = new A<>(55);
        Integer num = integerA.get();
        int ret = num.intValue();
        System.out.println(ret);

        A<String> stringA = new A<>("hello world");
        String str = stringA.get();
        System.out.println(str);
    }

}
