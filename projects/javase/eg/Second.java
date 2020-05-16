/*
	java数据类型 

		八个基本数据类型

		引用数据类型 :  类   枚举    字符串   数组....

		
	
*/	

class  Second{

		public static void main(String[] args) {
				byte by=12;
				int  in=34;
				//...
				char ch='男'; //两个字节 
					ch='1';

				System.out.println(ch);

				String   str="sadasdasda";

			//  char *str={};表示字符串
			//本身java语言是没有字符串一说  sum 加入 String 
			/*	String   str="asddas"; 

				System.out.println(str);


				System.out.println("张三"); //字面量写法

				System.out.println(45);

				System.out.println('a');

				System.out.println(45.8);	
			*/

			// System.out.println(56);	
			// System.out.println(045);
			// System.out.println(0xF7);
			// System.out.println(0b1001101);

			//整数默认的输出类型是 int     ---->默认的转换成十进制  

			//小数默认类型是double

			//window  计算机    程序员  其他进制的转换


			// long   lo=12312123213L;	

			// System.out.println(lo);

			// float  f=123.8F;//一般默认保留6位小数    

			// double d=3241.890D;//一般默认保留七位小数

			// boolean  flag=true;

			// System.out.println(true);
			// System.out.println(false);


			//System.out.println(null);





			/*

				命名规则:1.类名必须是字母开头 第一个字母必须大写  后面每个单词首字母大写 
						2.变量命名:满足驼峰命名规则  可以 以字母 $ _开头   首字母小写  从第一个单词开始 首字母大写 
							不能以关键字命名 不能以非法字符命名
						3.函数(方法) 命名要见名知意(满足命名规则)   	

				



			*/


				int  a=0;
				System.out.println(a);//这个写法 在C里面没有问题  但是在java里面不行    变量必须被初始化(赋值)才能使用


				int  x=12,y=2;
				//int   x=y=12; 错误写法

				System.out.println(Math.PI);

				//可以把double转换成整形  
				System.out.println(Math.random()*10); //得到结果是 0~1之间




				System.out.println("以下是数据类型进行转换:");
	


				/*
					隐式类型转换 
							char  ---->int

						  byte --->short  ----->int  ---->long  
							
						  float ---->double 
						  
							boolean 


					强制类型转换       目标类型    变量名=(目标类型)待转值

				

				*/

						ch='B';  // 65 

						System.out.println(ch+3);

						x=97;
						System.out.println((char)(x+3));	



						// byte   byt=34;
						// byte   byt2=67;
						// byte   d=byt+byt2; //从int转换到byte可能会有损失   byte   会默认的 转换成int 数据 


						byte b=127;
						byte ty=3;
						byte  n=(byte)(b+ty);  //溢出  -128~127  

						
						System.out.println("d的值是:"+n);	


						short   sh=12;
						// sh=sh+67;
						// System.out.println("sh的值是:"+sh);	


						sh=45;
						sh+=6;  //  ----->sh=(short)(sh+6);

						System.out.println("sh的值是:"+sh);	



						String   st="9+9";

						System.out.println(9+9+"9+9");	// 18+"9+9"  18被同化成字符串   

						System.out.println(9+st+9);  // 9+"9+9"  "99+9"+9====>99+99

						System.out.println(st+9+9);	  // "9+999"




							


		}


}
