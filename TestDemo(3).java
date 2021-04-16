import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-04-16
 * Time: 17:16
 */
public class TestDemo {


    public static boolean isSorted(int[] array) {
        if(array == null) return false;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }


    public static void reverse(int[] array) {
        int i = 0;
        int j = array.length-1;
        while (i < j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
    }

    public static void func4(int[] array) {
        int i = 0;
        int j = array.length-1;
        while (i < j) {
            //循环外面给了i < j  ,为啥这里还要给
            while (i < j && array[i] % 2 != 0) {
                i++;
            }
            //i 下标一定是偶数
            while (i < j && array[j] % 2 == 0) {
               j--;
            }
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        func4(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 数组的拷贝方式：
     * 1、for循环进行拷贝
     * 2、Arrays.copyOf
     * 3、System.arraycopy()
     * 4、数组名.clone()  -> 产生当前数组的一个副本
     * 如果以后使用数组的拷贝：优先使用下面两种
     *   System.arraycopy()
     *   Arrays.copyOf
     *
     * 深拷贝 和 浅拷贝
     *     这4种都是浅拷贝。
     * @param args
     */
    public static void mainCopy4(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }

    public static void mainCopy3(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] copy = new int[array.length];
        System.arraycopy(array,0,copy,0,array.length);
        System.out.println(Arrays.toString(copy));
    }

    public static void mainCopy2(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = Arrays.copyOf(array,2*array.length);
        System.out.println(Arrays.toString(ret));

        //[from,to)
        int[] ret2 = Arrays.copyOfRange(array,1,3);
        System.out.println(Arrays.toString(ret2));
    }

    public static void mainCopy1(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copy));
        System.out.println("===========修改===========");
        copy[0] = 99;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copy));
    }




    public static String myToString(int[] array) {
        assert array != null;
        if(array == null) return "null";
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret = ret + array[i];
            if(i != array.length-1) {
                ret = ret+",";
            }
        }
        ret = ret +"]";
        return ret;
    }
    public static int findMax(int[] array) {
        //int max = 0;//不可以直接定义最大值为max
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findNumIndex(int[] array,int key) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key) {
                return i;
            }
        }
        return -1;//代表没有找到当前的数字
    }

    public static int count = 0;

    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            count++;
            int mid = (left+right)/2;
            if(array[mid] == key) {
                return mid;
            }else if(array[mid] < key) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;//代表没有找到这个数字
    }
    public static void main3(String[] args) {
        /*int[] array = {1,2,5,12,7};
        System.out.println(binarySearch(array,12));*/

        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(binarySearch(array,9999));
        System.out.println(count);
    }


  /*  public static int func() {
        int a = 10;
        int b = 20;
        return a,b;
    }*/

    /**
     * 数组作为方法的返回值！
     * @return
     */
    public static int[] func() {
        int a = 10;
        int b = 20;
        int[] array = {a,b};
        return array;
    }

    /**
     * 将array这个数组扩大2倍
     * @param array
     */
    public static void func2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]*2;
        }
    }

    public static int[] func3(int[] array) {
        int[] tmp = new int[array.length];//
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i]*2;
        }
        return tmp;
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(array));
        int[] ret = func3(array);
        System.out.println(Arrays.toString(ret));
    }

    public static double avg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum+array[i];
        }
        double ret = sum*1.0 / array.length;
        return ret;
    }


    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(avg(array));



        int[] array2 = new int[100];


        for (int i = 0; i < array2.length; i++) {
            array2[i] = i+1;
        }

        System.out.println(Arrays.toString(array2));
    }
}
