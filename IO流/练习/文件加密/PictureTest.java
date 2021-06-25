package exer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PictureTest {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file = new File("666secret.jpg");
            fis = new FileInputStream(file);
            fos = new FileOutputStream("666secret1.jpg");

            byte[] buffer = new byte[10];
            int len ;
            while ((len = fis.read(buffer)) != -1){
                for (int i = 0; i < len; i++) {
                    buffer[i]  = (byte)(buffer[i] ^ 5) ;
                }

                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
    }
}
