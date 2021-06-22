package java4;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("hello.txt");
        File file1 = new File("D:\\Document\\code\\java_practice\\day_2021_06_22_generic\\src\\world.txt");

        /*System.out.println(file);
        System.out.println(file1);

        //构造器二
        File file2 = new File("D:\\Document\\code\\java_practice\\day_2021_06_22_generic\\src","javaTest");
        System.out.println(file2);

        //构造器三
        File file3 = new File(file2,"hi.txt");
        System.out.println(file3);*/

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.lastModified());

        System.out.println("\n");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        File file2 = new File("C:\\Users\\34391\\Desktop\\尚硅谷课件\\01_尚硅谷_JAVASE\\Java基础课件、项目、源码等\\04-代码\\第2部分：Java高级编程\\JavaSenior\\day08");

        String [] list = file2.list();
        for (String s:list ) {
            System.out.println(s);
        }
        System.out.println("\n");

        File[] files = file2.listFiles();
        for (File f:files) {
            System.out.println(f);
        }

//        boolean isFlag = file1.renameTo(file);
//        System.out.println(isFlag);

        System.out.println("\n" + file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());

        if (!file.exists()) {
            file.createNewFile();
            System.out.println("文件创建成功!");
        }else{
            file.delete();
            System.out.println("文件删除成功!");
        }


        File file3 = new File("D:\\Document\\code\\java_practice\\day_2021_06_22_generic\\src\\io1\\io4");
        if (file3.mkdir()) {
            System.out.println("创建成功1");
        }

        File file4 = new File("D:\\Document\\code\\java_practice\\day_2021_06_22_generic\\src\\io1\\io5");
        if (file4.mkdirs()) {
            System.out.println("创建成功2");
        }


    }
}
