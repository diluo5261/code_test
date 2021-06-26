package java1;

import org.junit.Test;

import java.io.*;

public class ObjectInputStreamOutputStreamTest {

    @Test
    public void test1(){
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("hello.dat"));

            oos.writeObject("中国天安门广场");
            oos.flush();

            oos.writeObject("i love china");
            oos.flush();

            oos.writeObject(new Person("tom",26));
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("hello.dat"));

            Object obj = ois.readObject();
            String str = (String)obj;

            String str2 = (String) ois.readObject();

            Person p =(Person)ois.readObject();

            System.out.println(str);
            System.out.println(p);
            System.out.println(str2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
