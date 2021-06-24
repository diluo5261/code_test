package java1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {

    @Test
    public void FileInputStreamTest(){
        FileInputStream fis = null;
        try {
            //1.实例化File对象,指明要操作的对象
            File file = new File("爱情与友情.jpg");
            //2.提供具体的流
            fis = new FileInputStream(file);

            //3.操作数据
            byte[] buffer = new byte[5];
            int len;
            while((len = fis.read(buffer)) != -1){
                String str = new String(buffer,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileInputStreamFileOutStream(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.实例化File对象,指明要操作的文件
            File file1 = new File("爱情与友情.jpg");
            File file2 = new File("爱情与友情2.jpg");

            //2.提供合适的流
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            //3.操作文件

            byte[] data = new byte[5];
            int len ;
            while((len = fis.read(data)) != -1){
                fos.write(data,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //指定路径下复制
    public void copyFile(String srcPath,String DestPath){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.实例化File对象,指定要操作的文件
            File srcFile = new File(srcPath);
            File destFile = new File(DestPath);

            //2.提供具体的流

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3.文件操作
            byte[] buffer = new byte[1024];
            int len ;
            while((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }





    }
}
