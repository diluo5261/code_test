//根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
import java.util.Scanner;		//导包
public class NineNumbers{
	public static void main(String[ ] args){
//1-100之间能被3和整除的数字
	int i =1;
	while(i<= 100){
		if(0 == i%3 && 0 == i%5){
			System.out.println(i);
		}
		i++;
	}




/*


		int i =1;
		int sum1 = 0;
		int sum2 = 0;
		while(i<=100){
			if(0 == i %2)
				sum1+=i;
			else if(1 == i%2)
				sum2+=i;
			i++;
		}

		System.out.println("奇数为:"+sum2);
		System.out.println("偶数为:"+sum1);

*/


/*
		Scanner scan = new Scanner(System.in);		//实例化
		int num = scan.nextInt();
		if(num >120)
			System.out.println("你是要成仙啊！");
		else if(num >=56)
			System.out.println("老年");
		else if(num >=29)
			System.out.println("中年");
		else if(num >=19)
			System.out.println("青年");
		else 
			System.out.println("少年");
*/
	}
}




/*
//给定一个数字,判断一个数字是否是素数

import java.util.Scanner;  //1、导包
public class NineNumbers{
	public static void main(String[] args){
		//2、实例化
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i =2;
		for(i =2;i<Math.sqrt(num);i++){
			if(0 ==num%i )
				break;
		}
		if(i>=Math.sqrt(num))
			System.out.println(num +"是素数");
		else
			System.out.println(num + "不是素数");

	}
}
*/

/*
//打印1-100之间所有的素数

public class NineNumbers{
	public static void main(String[ ] args){
		int i =2;
		int j =2;

		for(i =2;i<=100;i++){
			for(j =2;j<Math.sqrt(i);j++){
				if(0 ==i%j ){
					break;
				}
			}
			if(j>=Math.sqrt(i)){
				System.out.println(i);
			}
		}
	}
}

*/


/*
//编写程序数一下 1到 100 的所有整数中出现多少个数字9

public class NineNumbers{
	public static void main(String[ ] args){
		int sum = 0;
		for(int i = 1;i<= 100;i++){
			if(9 == i/10 )
				sum++;
			if(9 == i%10)
				sum++;
		}
		System.out.println("The number of 9 between 0 and 100:" + sum);
	}
}

*/




/*
public class NineNumbers{
	public static void main(String[ ] args){
		int year =1000;
		for(year = 1000;year <= 2000;year++){
			if(0 == year %4 && 0 != year %100  || 0 == year %400)
				System.out.println(year );		
		}
	}

}

*/

/*
public class NineNumbers{
	public static void main(String[ ] args){
		int i =1;
		int sum =0;
		for(i=1,i<100,i++){
			if(9 == i%10  || 9 == i /10){
				sum++;
				
			}
		}
		System.out.println("the number of nine is :"+sum);
	}
}
*/