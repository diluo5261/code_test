public class ArrTest413 {
    public static void main(String[] args) {
        // yanghui();
        //Value();
        TestArr1();


    }

    //数组的复制操作
    public static void TestArr1(){
        String[] arr = new String[]{"AA","BB","CC","DD","EE"};

        //数组的复制
        String[] arr1 = new String[arr.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] =arr[i];
        }

        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        //数组的反转
        int left =0;
        int right = arr1.length-1;
        //方法一:
       /* while (left < right){
            String tmp = arr1[left];
            arr1[left] = arr1[right];
            arr1[right] = tmp;
            left++;
            right--;
        }*/

        //方法二:
       /* for (int i = 0; i <arr1.length/2 ; i++) {
            String tmp = arr1[i];
            arr1[i] = arr1[arr1.length-i-1];
            arr1[arr1.length-i-1] = tmp;
        }*/

        //方法三:
        for (int i = 0,j = arr1.length-1; i <j ; i++,j--) {
            String tmp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = tmp;

        }

        //遍历
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        //查找
        String search = "CC";
        boolean isFlag = true;
        for (int i = 0; i <arr1.length ; i++) {
            if (search.equals(arr1[i])){
                System.out.println("找到了!");
                isFlag = false;
                break;
            }
        }
        if (isFlag){
            System.out.println("没有找到!");
        } 

        //二分查找  前提:所要查找的数据必须有顺序

    }


    public static void TestArr(){
        /*
        * 1\声明array1和array2两个int型数组
        * 2\使用大括号{},初始化array1为2,3,5,7,11,13,17,19
        * 3\显示array1的内容
        * 4\赋值array2变量等于array1,修改array2中的值,并打印array1
        * 思考array1 与 array2之间的关系
        *
        */

        int [] array1,array2;
        array1 = new int[]{1,3,5,7,11,13,17,19};

        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();

        array2 = array1;    //不能称为array2 是array1的赋值,只是地址值相同,都指向了堆空间中唯一的一个数组实体.
        for (int i = 0; i <array2.length ; i++) {
            if (i %2 == 0){
                array2[i] = i;
            }
        }

        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array1[i]+" ");
        }
    }

    //为数组赋随机值,并求出数组的最大值\最小值\平均值
    public  static void Value(){
        int[] arr = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random()*(99-10+1)+10);
        }
        for (int x:arr) {
            System.out.print(x+" ");
        }

        //求最大值
        int maxValue = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.println("\nmaxValue is : " + maxValue);

        //求最小值
        int minValue = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (minValue > arr[i]){
                minValue = arr[i];
            }
        }
        System.out.println("minValue is : " +minValue);

        //求和与平均值
        int sum = 0;

        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        double average = (double)sum /(double) arr.length;
        System.out.println("sumValue is : " +sum);
        System.out.println("averageValue is : " +average);
    }

    //打印杨辉三角
    public static void yanghui(){

        //杨辉三角打印
        //1、声明并初始化数组--动态初始化
        int [][] yangHui = new int[10][];
        //2、给数组元素赋值
        for (int i = 0; i <yangHui.length ; i++) {
            yangHui[i] = new int[i+1];

            //给首末元素赋值
            yangHui[i][0] = yangHui[i][i] = 1;
            //给每行的非首末元素赋值

            for (int j = 1; j <yangHui[i].length-1 ; j++) {
                yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
            }
        }

        //3、遍历二位数组
        for (int i = 0; i <yangHui.length ; i++) {
            for (int j = 0; j <yangHui[i].length ; j++) {
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();
        }

        int arr[][] = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sum =0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("总和为:"+sum);
    }
}