public class Test1 {

    public static void bobbleSort(int [] array){
        //i表示趟数
        for (int i = 0; i <array.length ; i++) {
            //j表示次数
            boolean flag = true;
            for (int j = 0; j <array.length-1-i ; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
            }
            if (flag) break;//结束循环
    }

    public static void reverse(int [] array){
        int i =0;
        int j = array.length-1;

        while(i < j){
        }
            int tmp = array[i];
            array[i] = array[j];
            array[j] = array[i];
            i++;
            j--;
        }
    }

    public static boolean isSorted(int[] array){
        if (array == null){
            return false;
        }

        for (int i = 0; i <array.length-1 ; i++) {
            if (array[i] > array[i+1]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8};
        System.out.println(isSorted(array));

    }
}
