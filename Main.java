//完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。

import java.util.Scanner;
public class Main{
	public static void main(String [] args){
		int value = (int)(Math.random()*100+1);
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("请输入你要猜的数字:");
			int num = scan.nextInt();
			if(num > value){
				System.out.print("大了!");
			}else if(num < value){
				System.out.print("小了!");
			}else{
				System.out.print("猜对了!");
				break;
			}
		}
	}
}

/*

//输出n*n的乘法口诀表,n由用户输入
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("输入n:");
		int n = scan.nextInt();
		for(int i =1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i + " * " + j +" = " +(i*j )+"  ");
			}
			System.out.println();
		}
	}
}

*/



/*
//输出一个整数的每一位
import java.util.Scanner;


public class Main{

	public static void paint(int num){
		if(num >9){
			paint(num/10);
		}
		System.out.print(num%10 + "\t");
		
	}


	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int num = scan.nextInt();
		paint(num);
	}

}
*/


/*
//获取一个数二进制序列中所有的奇数位和偶数位:
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int num = scan.nextInt();

		System.out.print("奇数位:");
		for(int i =30; i>=0; i-=2 ){
			System.out.print((num >> i ) & 1 );
		}
		System.out.println();

		System.out.print("偶数位:");
		for(int i =31; i>=0; i-=2 ){
			System.out.print((num >> i ) & 1  );
		}
		System.out.println();
	}
}
*/
/*
//内存中二进制1的个数
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数:");
		int num = scan.nextInt();
		int count =0;
		for(int i=0;i<32;i++){
			if((num >> i & 1) == 1){
				count++;
			}
		}
		System.out.println(num+"中1的个数为"+count);
	}
}

*/

/*
//求两个正整数的最大公约数
public class Main{

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("输入第一个数:");
		int num1 = scan.nextInt();
		System.out.print("输入第二个数:");
		int num2 = scan.nextInt();
		int max = num1 >num2?num1:num2;
		for(int i = max; i>0; i--){
			if(num1 % i ==0 && num2 % i == 0){
				System.out.println(num1+" 和 " + num2 +"的最大公约数为: " +i);
				break;
			}
		}
	}
}
*/
/*
//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
public class Main{

	public static void main(String[] args){
		
		double sumEven = 0.0;
		double sumOdd = 0.0;
		for(int i =1;i<=100;i+=2){
			sumOdd+= 1.0/i;
		}
		
		for(int i =2;i<=100;i+=2){
			sumEven+= 1.0/i;
		}
		
		System.out.println("1/1-1/2+1/3-1/4......+1/99-1/100 = " + (sumOdd - sumEven));

	}
}
*/


//求水仙花数
/*
public class Main{

	public static void main(String[] args){
		for(int i =100 ; i<1000; i++){
			int unit =i%10;
			int tens =i/10%10;
			int hundred = i/100;
			if(i == Math.pow(unit,3) + Math.pow(tens,3) + Math.pow(hundred,3)){
				System.out.println(i+"是水仙花数!");
			}
		}
	}
}

*/
/*
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            for(int i =0;i<num;i++){
                for(int j =0;j<num;j++){
                    if(i == j || j== num-i-1){
                        System.out.print('*');
                    }else{
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }
    }
}

*/