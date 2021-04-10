import java.util.Scanner;
public class Test{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int count =3;
	while(count != 0){
		System.out.print("请输入密码:");
		String password = scan.nextLine();
		if(password.equals("123")){
			System.out.println("登录成功");
			break;
		}else{
			count--;
			System.out.println("输入错误!\n你还有"+count+"次输入机会!");
		}
	}

	}

}

/*
import java.util.Scanner;
//给定一个范围,求其中的水仙花数
public class Test{
	public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
	int num = 99999999;
	for(int i =0; i<num; i++){
		int count =0;
		int tmp = i;
		while(tmp != 0){
			count++;
			tmp/=10;
		}
		tmp =i;
		int sum=0;
		while(tmp != 0){
			sum += Math.pow(tmp%10,count);
			tmp/=10;
		}
		
		if(sum == i){
			System.out.println(i);
		}


	}
	

	}



}
*/


/*
//1/1-1/2+1/3-1/4.....+1/99-1/100
public class Test{
	public static void main(String[] args){
		double sum =0.0;
		int flag =1;
		for(int i =1; i<=100; i++){
			sum+=1.0/i*flag;
			flag = -flag;
		}
		System.out.println(sum);
	}
}

*/

/*
//求两个书的最大公约数
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("输入第一个数:");
		int num1 = scan.nextInt();
		System.out.print("输入第二个数:");
		int num2 = scan.nextInt();
		int max = num1>num2?num1:num2;
		int min = num1>num2?num2:num1;
		while(max%min != 0){
			int tmp = max %min;
			max = min;
			min = tmp;
		}
		System.out.println(min);
		

	}



}
*/