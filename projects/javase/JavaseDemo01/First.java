//java编程文件是以.java为结尾的 
//  First.txt  --->First.java
//  长度    m    km    cm   mm     
/*
	java编程是以class文件为单位(以类为单位)

	访问修饰符   class   类名{
		代码;
	}

jre   java   runtime enviements

jdk   java  developer  kits


javac  类名.java
java   类名

一般情况下  建议类名和文件一致

*/
class  Demo{
		public static void main(String[] args) {
			System.out.println("我是你的谁?");
				for (int i=0;i<args.length ; i++) {
					System.out.println("我是你的谁?"+args[i]);
				}


		}

}	




