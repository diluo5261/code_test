//递归求n的阶乘
    public static int sum(int n){
        if (1 == n){
            return 1;
        }
        return n*sum(n-1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入n的大小：");
        int n = scan.nextInt();
        System.out.println("n! = "+ sum(n));

    }


    //递归求和
//    public static  int sum(int n){
//        if (n == 1){
//            return 1;
//        }
//        return n+sum(n-1);
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("输入n：");
//        int n = scan.nextInt();
//        System.out.println("1+...+n的和为："+sum(n));
//    }

//    //打印数字的每一位
//    public static  void printNum(int num){
//        if (num <10){
//            System.out.println(num%10+ " ");
//            return;
//        }
//        printNum(num/10);
//       System.out.println(num % 10 +" ");
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入一个数字：");
//        int num = scan.nextInt();
//        printNum(num);
//    }


    //返回一个数字之和

//    public  static int sumNum(int n){
//        if (n <10){
//            return n;
//        }
//        return n%10+sumNum(n/10);
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("输入一个数字：");
//        int num =scan.nextInt();
//
//        System.out.println(num + "组成数字之和为：" +sumNum(num));
//    }

    //斐波那契数列数列
//    public static  int fib(int n){
//        if (n <= 2){
//            return 1;
//        }
//        return fib(n-1) + fib(n-2);
//    }
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("输入n的大小：");
//        int n =scan.nextInt();
//        System.out.println("斐波那契数列的第 "+n +"位是： "+fib(n));
//    }

//青蛙跳台阶问题
//    public static int jumpfloor(int n){
//       if (1 == n || 2 == n){
//           return n;
//       }
//       return jumpfloor(n-1)+jumpfloor(n-2);
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("输入台阶的个数：");
//        int n = scan.nextInt();
//        System.out.println("共有" + jumpfloor(n)+"种跳法！");
//    }