package java1;

import org.junit.Test;

import java.io.*;

public class BufferedTest {
    /*
    1.缓冲流
    BufferedInputStream
    BufferedOutputStream
    BufferedReader
    BufferedWriter

    2.作用:提供流的读取写入的速度
        提供读写速度的原因:在内部提供了一个缓冲区

    3.处理流就是套接在已有的流的基础上
     */

    @Test
    public void BufferedStreamTest(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.实例化File对象,指明要操作的文件
            File srcFile = new File("爱情与友情.jpg");
            File destFile = new File("爱情与友情3.jpg");

            //2.提供具体的流
            //2.1造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            //2.造缓冲流

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);


            //3.文件操作
            byte[] buffer = new byte[10];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
    //            bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭
            //先关闭外层的流,再关闭内层的流,但是关闭外层流时,内层流也会自动关闭,所以可以省略外层流的关闭


            if (bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*@Test
    //实现文件复制的方法
    public void copyFileWithBuffered(String srcPath, String destPath){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.实例化File对象,指明要操作的文件
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //2.造流,提供具体的流
            //2.1造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            //2.2造缓冲流

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.复制文件

            byte [] buffer = new byte[1024];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            //先关闭外层流,再关闭内层流,在关闭外层流的同时,内层流会自动关闭,我们可以省略
            if (bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/

    @Test
    public void testCopyFile(){
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.实例化File对象,指明要操作的文件
            File srcFile = new File("EPLAN.7z");
            File destFile = new File("EPLAN1.7z");

            //2.提供具体的流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3.复制操作
            byte [] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
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

            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end -start);//16808  5028
    }

    @Test
    public void testBufferedReaderBufferedWrite(){
        long start = System.currentTimeMillis();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //实例化File对象,指明要操作的文件按
            File srcFile = new File("EPLAN.7z");
            File destFile = new File("EPLAN2.7z");

            //2.提供具体的流
            //2.1 节点流,文件流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            //2.2 造处理流,缓冲流

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //复制文件
            byte[] buffer = new byte[1024];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if (bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
