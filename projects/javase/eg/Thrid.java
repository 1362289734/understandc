

import  java.util.Scanner;  //指定Scanner工具类在哪个包里面   
//import  java.util.lang;

class  Thrid{




	public   static  int  sum(int  x,int y){

		return   x+4+y+7;
	}

	public   static  double  sum(double  x,double y){

		return   x+4+y+7;

	}

	public   static  float  sum(float  x,float y){

		return   x+4+y+7;

	}

	public   static  long  sum(long  x,long y){

		return   x+4+y+7;
	}



	public   static  double  sum(double  x,double y,double z){

		return   x+4+y+7+z;

	}

	public   static  double  sum(double  x,double y, double z,double  t){

		return   x+4+y+7+z+t;

	}

	//以上的写法叫方法的重载:方法名一样 参数列表不一样  且跟返回值没有关系的  
	// 为了方便调用



	public static void main(String[] args) {
			  

		System.out.println(sum(3.4,5.6));

		
		// Scanner  sc=new  Scanner(System.in);  //  获取手动输入数据的对象

		// while(true){ // 括号里面结果之能事boolean类型的表达式

		// 	System.out.println("请输入姓名:");
		// 	String   name=sc.next();//  sc.nextLine();对比一下这两个的区别
		// 	System.out.println("请输入密码:");
		// 	String   password=sc.next();  //sc.nextInt();表示获取整形数据   

		// 		if(name.equals("张三") && password.equals("123456")){
		// 			System.out.println("欢迎"+name+"登录");
		// 			break;//退出当前循环
		// 		}else{
		// 			System.out.println("您输入的账户名或者是密码不正确,请重新输入");

		// 		}

		// 	}




		//------------------------------------------------------
		int   d=12;
		// if(d=45){  // if(条件判断(boolean)){}   true|false
		// 	System.out.println(d);
		// }

		int   sw=12;

		// switch(){ //  括号里面可以装  整形    字符型  字符串   枚举(jdk1.5才支持)  


		// }


		// 静态数组   数据类型  [] 数组名={元素1,元素2,...}:
		int []  arr0={};  //静态数组没有默认值
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
		//System.out.println("数组的长度是:"+arr0.length+"----"+arr0[0]);




		//动态数组    数据类型 [] 数组名=new  数据类型[数组长度];
		int   [] arr=new  int[3];  // 系统会给默认值  0
		// arr[0]=123;
		// arr[2]=1213;
		// arr[1]=121113;

		int  [] arr2=new  int[4];
		arr2=arr;

		System.out.println(arr2[0]);
		

		//  int  [] arr=new  int[9]{}; 这种写法错误
		int [] array=new int[]{12,3412};		

		System.out.println(array[0]);
		

		// 
		int [][] array1={{},{},{},{}};


		int [][] array2=new int[2][3];//两层楼房 没一层楼房里面有三个房间

		int [][] array3=new  int[3][]; //可以这么写

		array3[0]=new  int[3];

		array3[1]=new  int[4];
		array3[2]=new  int[5];


				






		

	}


}