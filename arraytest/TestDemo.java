public class TestDemo {

    //只要是new的就一定在堆上

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);
        list.add(5,6);
        list.add(6,7);
        list.display();
        System.out.println("*****************************");
        list.remove(5);
        list.display();



    }








    /*static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args){
        System.out.println("cnt =" + cnt);
    }
    static{
        cnt /=3;
    };*/
    /*private int count;

    public static void main(String[] args) {

        TestDemo test=new TestDemo(88);

        System.out.println(test.count);

    }

    TestDemo(int a) {

        count=a;

    }*/

}
