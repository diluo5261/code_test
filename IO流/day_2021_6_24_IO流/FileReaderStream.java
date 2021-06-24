package java1;

import org.junit.Test;

import java.io.*;

public class FileReaderStream {
   /* public static void main1(String[] args) {
        File file = new File("hello.txt");
        System.out.println(file.getAbsolutePath());
    }

    @Test
    public void test1() throws IOException {
        File file1 = new File("hello.txt");
        System.out.println(file1.getAbsolutePath());//相较于当前工程
        if (!file1.exists()){
            file1.createNewFile();
            System.out.println("文件创建成功!");
        }else{
            System.out.println("文件存在!");
        }
        File file2 = new File("D:\\Document\\code\\java_practice\\day_2021_06_23_IOStream\\src\\java1\\hello.txt");
        System.out.println(file2.getAbsolutePath());
    }

    @Test
    public void testFileReader(){
        //节点流(文件流)
        //1.实例化File对象,指明要操作的文件
        File file = new File("hello.txt");


        FileReader fl = null;
        try {
            //2.提供具体的流
            fl = new FileReader(file);
            //3.数据的读入
            //方法一:
//            int data = fl.read();
//            while(data != -1){
//                System.out.print((char)data);
//                data = fl.read();
//            }

            //方法二:
            int data;
            while((data = fl.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.流的关闭操作
            if (fl != null){
                try {
                    fl.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    @Test
    public void testFileReader1(){
        //1.实例化File对象,指明要操作的文件
        FileReader fl = null;
        try {
            File file = new File("hello.txt");

            //2.提供具体的流
            fl = new FileReader(file);

            //3.进行读取操作
            char[] data = new char[5];
            int len;
            while((len = fl.read(data)) != -1){
//                for (int i = 0; i <len ; i++) {
//                    System.out.print((char)data[i]);
//                }

                String str = new String(data,0,len);
                System.out.print(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            if (fl != null){
                try {
                    fl.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/

    @Test
    public void Test1() throws IOException {
        //1.实例化File的对象,指明要操作的文件
        File file = new File("hello.txt");

        //2.判断文件是否存在,如不存在则创建
        if (!file.exists()){
            file.createNewFile();
            System.out.println("文件创建成功!");
        }

        System.out.println("文件路径为: " + file.getAbsolutePath());
    }

    @Test
    public void testFileReader(){
        FileReader fl = null;
        try {
            //1.实例化File对象,指明要操作的文件
            File file = new File("hello.txt");

            //2.提供具体的流
            fl = new FileReader(file);

            //3.数据的读入

            //方式一
//            int  ch = fl.read();
//            while(ch != -1){
//                System.out.print((char)ch);
//                ch = fl.read();
//            }

            //方式二:
            int ch ;
            while((ch = fl.read()) != -1){
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭
            if (fl != null){
                try {
                    fl.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileReader1(){
        //1.实例化File对象,指明要操作的文件
        FileReader fl = null;
        try {
            File file = new File("hello.txt");
            //2.提供具体的流
            fl = new FileReader(file);

            //3.进行数据操作
            char [] data = new char[5];
            int len;
            while((len = fl.read(data)) != -1){
                //方法一
//                for (int i = 0; i < len; i++) {
//                    System.out.print(data[i]);
//                }

                //方法二:
                String str = new String(data,0,len);
                System.out.print(str);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭
            if (fl != null){
                try {
                    fl.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileWriter(){
        FileWriter fw = null;
        try {
            //1.实例化File对象,指明要操作的文件
            File file = new File("hello.txt");

            //2.提供具体的流
            fw = new FileWriter(file,true);
            //3.数据的写入
            fw.write('X');
            fw.write("i have a dream !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭

            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void testFileReaderFileWriter(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.实例化File的对象,指明要操作的文件
            File file1 = new File("爱情与友情.jpg");
            File file2 = new File("爱情与友情1.jpg");
            //2.提供具体的流

            fr = new FileReader(file1);
            fw = new FileWriter(file2);

            //3.数据的操作
            char [] data = new char[5];
            int len;
            while((len = fr.read(data)) != -1){
                fw.write(data,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }










}



