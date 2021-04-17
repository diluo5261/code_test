import java.util.Arrays;

public class HomeWork_Copyof_4_17 {
    public static void main(String[] args) {
        int [] arr = {1,2,5,6,3,4,8,4,5,4,564,26,354};
        System.out.println(Arrays.toString(copyOf(arr)));
    }
    public static int[] copyOf(int [] arr){
        if(null == arr){
            return null;
        }

        int [] copy = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }
}