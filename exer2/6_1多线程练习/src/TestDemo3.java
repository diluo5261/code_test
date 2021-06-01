import java.util.Objects;

class MyList <T>{
    private  T[] elem;
    private int usedSize;

    public MyList() {
        this.elem = (T[])new Object[10];
    }

    public void add(T val){
        this.elem[this.usedSize++] = val;
    }

    public T getPos(int pos){
        return this.elem[pos];
    }
}

public class TestDemo3 {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(100);
        System.out.println(list.getPos(0));
//        for (Integer x:list) {
//            System.out.println(x);
//
//        }

        MyList<String> list2 = new MyList<>();
        list2.add("a");
        list2.add("sd");
        System.out.println(list2.toString());
    }

}
