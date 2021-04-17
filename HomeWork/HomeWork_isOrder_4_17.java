public class HomeWork_isOrder_4_17 {
    public static void main(String[] args) {
        //给定一个整型数组, 判定数组是否有序（递增）
        int [] arr = {1,2,3,5,46,89,5,123,4};
        int [] arr2 = {5,7,8,9,12,36,54,58,59,62};

        if (isOrder(arr)){
            System.out.println("arr有序");
        }else{
            System.out.println("arr无序");
        }

        if (isOrder(arr2)){
            System.out.println("arr2有序");
        }else{
            System.out.println("arr2无序");
        }

    }