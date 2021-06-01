package exer;

import java.util.ArrayList;

public class RemoveTest {
    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        ArrayList<Character>  list3= new ArrayList<>();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int i = 0;
        int j = 0;

        s1: for (i = 0; i <ch1.length ; i++) {
            for (j = 0; j <ch2.length ; j++) {
                if (ch1[i] == ch2[j]){
                    continue s1;
                }
            }

                list3.add(ch1[i]);
        }
        for (char c1: list3 ) {
            System.out.print(c1);

        }
    }
}
