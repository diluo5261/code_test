public class ArrTest {
    public static void main(String[] args) {

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

//        int arr[][] = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
//        int sum =0;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                sum += arr[i][j];
//            }
//        }
//        System.out.println("总和为:"+sum);
    }
}
