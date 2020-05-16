// import java.util.*;
// import java.util.Scanner;

// class basic_1{
// 	public static void main(String[] args) {
				//1
		// Scanner sc = new Scanner(System.in);
		// System.out.println("please input the first number:");
		// int num1 = sc.nextInt();
		// System.out.println("please input the second number:");
		// int num2 = sc.nextInt();
		// System.out.println("please input the third number:");
		// int num3 = sc.nextInt();
		// System.out.println("a:"+num1+",b:"+num2+",c:"+num3);
		// System.out.println("a+b+c="+(num1+num2+num3)+",a-b-c="+(num1-num2-num3));
		/*******************************************************************************/
		//2
		//BCD+2F=3021+47=3068
		/*******************************************************************************/
		//3
		//10011101=(235)8=(9D)16
		/*******************************************************************************/
		//4
		/*******************************************************************************/
		//6
		// short price = 100; 
		// short realPrice = (short)(price * 8 / 10); 
		// System.out.println("realPrice="+realPrice);

		/*******************************************************************************/
		//7			
			// int i=1,j;  

			// float f1=0.1;  //0.1f或者（float）0.1，因为自动认为0.1是double类型
			// float f2=123;   
			// long  l1=123141L,l2=88888888888;//l2m末尾要加l
			// double d1=2e20,d2=124;
			// byte b1=1,b2=2,b3=129;//b3溢出
			// j=j+10;
			// i=i/10;
			// i=i*0.1;//0.1自动认为是double类型，i默认int类型，需要进行转换
			// System.out.println(j+"asd"+i);
			// char c1='a',c2=125;

			// byte b=b1-b2;//上面的b1，b2，转换成了int类型，这里需要进行强制类型转换

			// char c=c1+c2-1;   //需要强制类型转换
			// float f3=f1+f2;

			// float f4=f1+f2*0.1;//这里的f1和0.1都是认为double类型

			// double d=d1*i+j;

			// float f=(float)(d1*5+d2);
		/*******************************************************************************/		
		//8
			// public static void change(){
			// 	int  a=2;
			// 	int  b=3;
			// 	int  c=a;

			// 	a=b;
			// 	b=c;
				
			// 	//a=a+b;
			// 	//b=a-b;
			// }
		/*******************************************************************************/	
		//9
		// int a = 9 / 3;//3除法
		// System.out.println("a="+a);
		// int b = 9 % 2;//1取余
		// System.out.println("b="+b);
		/*******************************************************************************/	
		//10
		// float a = 2.1;//默认为double 需要转换

		// float b = (double)20.9;//需要转换成float

		// int b3 = 210.9f +2.51;//2.51需要转换

		// int b4 = (int)20.9 + (int)2.51;//正确
		/*******************************************************************************/	
		//12
		// Scanner sc=new Scanner(System.in);
		// String str = sc.next();
		// System.out.println(str.toLowerCase());
		/*******************************************************************************/	
		//13
		//先小写，第二个单词开始首字母大写，方法函数尽量以功能命名
// 	}
// }
/*basic_2
	1、A
	2、A
	3、A
*/
import java.util.*;
import java.util.Scanner;

class basic_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int num1 = (int)(num);
		if(num1 % 2 == 0){
			System.out.println("even");
		}else{
			System.out.println("odd");
		}
	}
}